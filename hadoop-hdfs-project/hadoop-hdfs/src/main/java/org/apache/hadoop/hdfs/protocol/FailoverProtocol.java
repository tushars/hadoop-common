package org.apache.hadoop.hdfs.protocol;

import java.io.IOException;

public interface FailoverProtocol {

	public void switchToActive() throws IOException;
}
