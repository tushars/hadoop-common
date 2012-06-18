package org.apache.hadoop.hdfs.server.namenode.failover.transactions;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

/**
 * This class is responsible for deleting an emphemeral znode.
 */
public class DeleteNodeTransaction extends Transaction<String> {



    /**
     * <p>Deletes a znode</p>    
     * @param conn the zookeeper connection
     * @param nodePath the path of node being created  
     */
    public DeleteNodeTransaction(ZooKeeper conn,String nodePath){
        super(conn,nodePath);
    }

    @Override
    protected void trasactionBody() throws KeeperException,
            InterruptedException {
        zooConn.delete(path, -1);
    }

    @Override
    public String toString() {
        return "DeleteNodeTransaction " +  "path=" + path 
                + ", zooConn=" + zooConn + "]";
    }
}
