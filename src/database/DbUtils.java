/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import ModelNew.systAdmin;


/**
 *
 * @author Samikshan
 */
public class DbUtils {
    
    private static DbUtils dbUtils;

    private DbUtils() {

    }

    public static DbUtils getInstance() {
        if (dbUtils == null) {
            dbUtils = new DbUtils();
        }
        return dbUtils;
    }

    private ObjectContainer createConnection() {
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        config.common().activationDepth(Integer.MAX_VALUE);
        config.common().objectClass(systAdmin.class).updateDepth(Integer.MAX_VALUE);
        config.common().objectClass(systAdmin.class).cascadeOnUpdate(true);

        ObjectContainer db = Db4oEmbedded.openFile(config, "database/FeelHome.db4o");
        return db;
    }

    public synchronized void storeSystem(systAdmin system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public systAdmin retrieveSystem() {
        try {
            ObjectContainer conn = createConnection();
            ObjectSet<systAdmin> systems = conn.query(systAdmin.class); // Change to the object you want to save
            systAdmin system;
            if (systems.isEmpty()) {
                system = systAdmin.createsystAdmin();
            } else {
                system = systems.get(systems.size() - 1);
            }
            conn.close();
            return system;
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return null;
    }

}
