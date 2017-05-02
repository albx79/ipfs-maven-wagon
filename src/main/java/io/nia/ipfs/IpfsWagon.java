package io.nia.ipfs;

import org.apache.maven.wagon.*;
import org.apache.maven.wagon.authentication.AuthenticationException;
import org.apache.maven.wagon.authorization.AuthorizationException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;


public class IpfsWagon extends StreamWagon {

    @Override
    public void fillInputData(InputData inputData) throws TransferFailedException, ResourceDoesNotExistException, AuthorizationException {
        throw new NotImplementedException();
    }

    @Override
    public void fillOutputData(OutputData outputData) throws TransferFailedException {
        throw new NotImplementedException();
    }

    @Override
    protected void openConnectionInternal() throws ConnectionException, AuthenticationException {
        throw new NotImplementedException();
    }

    @Override
    public void closeConnection() throws ConnectionException {
        throw new NotImplementedException();
    }
}
