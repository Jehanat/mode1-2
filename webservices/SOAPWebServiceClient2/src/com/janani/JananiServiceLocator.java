/**
 * JananiServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.janani;

public class JananiServiceLocator extends org.apache.axis.client.Service implements com.janani.JananiService {

    public JananiServiceLocator() {
    }


    public JananiServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JananiServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Janani
    private java.lang.String Janani_address = "http://192.168.1.2:8191/SOAPWebServiceXMLBased/services/Janani";

    public java.lang.String getJananiAddress() {
        return Janani_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String JananiWSDDServiceName = "Janani";

    public java.lang.String getJananiWSDDServiceName() {
        return JananiWSDDServiceName;
    }

    public void setJananiWSDDServiceName(java.lang.String name) {
        JananiWSDDServiceName = name;
    }

    public com.janani.Janani getJanani() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Janani_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJanani(endpoint);
    }

    public com.janani.Janani getJanani(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.janani.JananiSoapBindingStub _stub = new com.janani.JananiSoapBindingStub(portAddress, this);
            _stub.setPortName(getJananiWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJananiEndpointAddress(java.lang.String address) {
        Janani_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.janani.Janani.class.isAssignableFrom(serviceEndpointInterface)) {
                com.janani.JananiSoapBindingStub _stub = new com.janani.JananiSoapBindingStub(new java.net.URL(Janani_address), this);
                _stub.setPortName(getJananiWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Janani".equals(inputPortName)) {
            return getJanani();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://janani.com", "JananiService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://janani.com", "Janani"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Janani".equals(portName)) {
            setJananiEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
