package com.bindu;

public class BinduProxy implements com.bindu.Bindu {
  private String _endpoint = null;
  private com.bindu.Bindu bindu = null;
  
  public BinduProxy() {
    _initBinduProxy();
  }
  
  public BinduProxy(String endpoint) {
    _endpoint = endpoint;
    _initBinduProxy();
  }
  
  private void _initBinduProxy() {
    try {
      bindu = (new com.bindu.BinduServiceLocator()).getBindu();
      if (bindu != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bindu)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bindu)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bindu != null)
      ((javax.xml.rpc.Stub)bindu)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bindu.Bindu getBindu() {
    if (bindu == null)
      _initBinduProxy();
    return bindu;
  }
  
  public int getInt() throws java.rmi.RemoteException{
    if (bindu == null)
      _initBinduProxy();
    return bindu.getInt();
  }
  
  
}