package BaseDatos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjFileManager {
    private static FileOutputStream fileOut;
    private static ObjectOutputStream ObjOut;

    public static void deleteFromFile(String filePath) {
        try {
            FileOutputStream file = new FileOutputStream(filePath);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveObjToFile(ArrayList<Object> obj, String filePath, boolean saveObjects) { //saveObjects tiene como objetivo preservar los 
        ArrayList<Object> obj_ = new ArrayList<Object>();                                           //objetos que ya se encontraan guardados antes, 
        try {                                                                                       //si es false se borra cualquier dato que se 
            FileInputStream file = new FileInputStream(filePath);                                   //encontrara en el archivo antes
            ObjectInputStream in = new ObjectInputStream(file);
            try {
				Object obj__ = in.readObject();
				while(obj__ != null) {
					obj_.add(obj__);
					obj__ = in.readObject();
				}
			} catch (EOFException e) {
				e.printStackTrace();
			}
            in.close();
            file.close();
        } catch (EOFException e) {
            //e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

        try {
            FileOutputStream file = new FileOutputStream(filePath);
            ObjectOutputStream out = new ObjectOutputStream(file);
            for(Object o : obj)
                obj_.add(o);
            for(Object o : obj_)
                out.writeObject(o);
			out.close();
            file.close();
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
            e.printStackTrace();
        } 
    }
    public static void saveObjToFile(Object obj, String filePath) { //Guarda un unico objeto en el archivo especificado
        ArrayList<Object> obj_ = new ArrayList<Object>();
        obj_.add(obj);
        saveObjToFile(obj_, filePath, true);
    }
    public static ArrayList<Object> getObjFromFile(String filePath) { //Retorna un arrayList con todos los objetos de un archivo
        try {
            FileInputStream file = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(file);
			ArrayList<Object> obj_ = new ArrayList<Object>();
            try {
				Object obj__ = in.readObject();
				while(obj__ != null) {
					obj_.add(obj__);
                    obj__ = in.readObject();
				}
			} catch (EOFException e) {
				//e.printStackTrace();
			}
            in.close();
            file.close();
            return obj_;
        } catch (EOFException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        return null;
    }
    public static void open(String filePath, boolean saveObjects) { //Abre un archivo para agregar objetos 1 a 1(Se mantiene abierto hasta que se llama close())
        ArrayList<Object> ObjOutCache = null;
        if(saveObjects) {
            try {
                FileInputStream file = new FileInputStream(filePath);
                ObjectInputStream in = new ObjectInputStream(file);
                ObjOutCache = new ArrayList<Object>();
                try {
                    Object obj_ = in.readObject();
                    while(obj_ != null) {
                        ObjOutCache.add(obj_);
                        obj_ = in.readObject();
                    }
                } catch (EOFException e) {
                    e.printStackTrace();
                }
                in.close();
                file.close();
            } catch (EOFException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        try {
            fileOut = new FileOutputStream(filePath);
            ObjOut = new ObjectOutputStream(fileOut);
            if(saveObjects) {
                for(Object o : ObjOutCache) {
                    ObjOut.writeObject(o);
                }
            }
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
            e.printStackTrace();
        } 
    }
    public static void close() { //Cierra el archivo abierto por open(...)
        try {
            ObjOut.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
            e.printStackTrace();
        } 
    }
    public static void addObj(Object obj) { //Agrega un objeto al archivo que se abrió con open(...)
        try {
            ObjOut.writeObject(obj);
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
            e.printStackTrace();
        } 
        
    }
}
