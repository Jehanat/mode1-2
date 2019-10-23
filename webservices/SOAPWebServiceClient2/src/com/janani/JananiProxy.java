package com.janani;

public class JananiProxy implements com.janani.Janani {
  private String _endpoint = null;
  private com.janani.Janani janani = null;
  
  public JananiProxy() {
    _initJananiProxy();
  }
  
  public JananiProxy(String endpoint) {
    _endpoint = endpoint;
    _initJananiProxy();
  }
  
  private void _initJananiProxy() {
    try {
      janani = (new com.janani.JananiServiceLocator()).getJanani();
      if (janani != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)janani)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)janani)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (janani != null)
      ((javax.xml.rpc.Stub)janani)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.janani.Janani getJanani() {
    if (janani == null)
      _initJananiProxy();
    return janani;
  }
  
  public java.lang.String getName() throws java.rmi.RemoteException{
    if (janani == null)
      _initJananiProxy();
    return janani.getName();
  }
  
  
}