package cn.hit.hadoop.rpc;

import org.apache.hadoop.ipc.ProtocolSignature;
import org.apache.hadoop.ipc.VersionedProtocol;

import java.io.IOException;

/**
 * Created by Administrator on 2018/10/16.
 */
public interface LoginServiceInterface extends VersionedProtocol{
    public static final long versionID=1L;

    public String login(String username,String password);
    @Override
    long getProtocolVersion(String protocol, long clientVersion) throws IOException;

    @Override
    ProtocolSignature getProtocolSignature(String protocol, long clientVersion, int clientMethodsHash) throws IOException;
}
