package cn.hit.hadoop.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

/**
 * 调试hadoop rpc protocol原码用
 */
public class hdfsClientProtocolTest {

    public  static  void main(String args[]) throws  Exception{
        String local="d:/workflow2.xml";
        String dest="hdfs://10.10.50.35:8020/tmp/workflow.xml";
        Configuration cfg=new Configuration();
        FileSystem fs=  FileSystem.get(URI.create(dest),cfg,"hdfs");
        fs.copyFromLocalFile(new Path(local), new Path(dest));
        fs.close();
    }
}
