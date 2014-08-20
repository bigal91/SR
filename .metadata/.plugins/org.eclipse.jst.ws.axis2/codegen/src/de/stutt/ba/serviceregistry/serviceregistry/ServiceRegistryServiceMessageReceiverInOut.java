
/**
 * ServiceRegistryServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package de.stutt.ba.serviceregistry.serviceregistry;

        /**
        *  ServiceRegistryServiceMessageReceiverInOut message receiver
        */

        public class ServiceRegistryServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ServiceRegistryServiceSkeleton skel = (ServiceRegistryServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("registerUser".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource booleanResource78 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               booleanResource78 =
                                                   
                                                   
                                                         skel.registerUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), booleanResource78, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "registerUser"));
                                    } else 

            if("searchByServiceConfiguration".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.AbstractService abstractService80 = null;
	                        java.lang.String wrappedParam =
                                                             (java.lang.String)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    java.lang.String.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               abstractService80 =
                                                   
                                                   
                                                         skel.searchByServiceConfiguration(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), abstractService80, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "searchByServiceConfiguration"));
                                    } else 

            if("createServiceConfigurationWithInterface".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.LongResource longResource82 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationWithInterfaceRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationWithInterfaceRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationWithInterfaceRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               longResource82 =
                                                   
                                                   
                                                         skel.createServiceConfigurationWithInterface(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), longResource82, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "createServiceConfigurationWithInterface"));
                                    } else 

            if("loginUser".equals(methodName)){
                
                java.lang.String string84 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               string84 =
                                                   
                                                   
                                                         skel.loginUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), string84, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "loginUser"));
                                    } else 

            if("createProvisionedService".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.LongResource longResource86 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               longResource86 =
                                                   
                                                   
                                                         skel.createProvisionedService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), longResource86, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "createProvisionedService"));
                                    } else 

            if("editNotProvisionedDedicatedService".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource booleanResource88 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               booleanResource88 =
                                                   
                                                   
                                                         skel.editNotProvisionedDedicatedService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), booleanResource88, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "editNotProvisionedDedicatedService"));
                                    } else 

            if("searchByProvider".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.AbstractService abstractService90 = null;
	                        java.lang.String wrappedParam =
                                                             (java.lang.String)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    java.lang.String.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               abstractService90 =
                                                   
                                                   
                                                         skel.searchByProvider(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), abstractService90, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "searchByProvider"));
                                    } else 

            if("createServiceInterface".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.LongResource longResource92 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.CreateServiceInterfaceRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.CreateServiceInterfaceRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.CreateServiceInterfaceRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               longResource92 =
                                                   
                                                   
                                                         skel.createServiceInterface(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), longResource92, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "createServiceInterface"));
                                    } else 

            if("editNotProvisionedSharedService".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource booleanResource94 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               booleanResource94 =
                                                   
                                                   
                                                         skel.editNotProvisionedSharedService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), booleanResource94, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "editNotProvisionedSharedService"));
                                    } else 

            if("createServiceConfiguration".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.LongResource longResource96 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               longResource96 =
                                                   
                                                   
                                                         skel.createServiceConfiguration(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), longResource96, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "createServiceConfiguration"));
                                    } else 

            if("searchByQualifiedPortTypeName".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.AbstractService abstractService98 = null;
	                        java.lang.String wrappedParam =
                                                             (java.lang.String)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    java.lang.String.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               abstractService98 =
                                                   
                                                   
                                                         skel.searchByQualifiedPortTypeName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), abstractService98, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "searchByQualifiedPortTypeName"));
                                    } else 

            if("createNotProvisionedDedicatedService".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.LongResource longResource100 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               longResource100 =
                                                   
                                                   
                                                         skel.createNotProvisionedDedicatedService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), longResource100, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "createNotProvisionedDedicatedService"));
                                    } else 

            if("deleteService".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource booleanResource102 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.LongResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.LongResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.LongResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               booleanResource102 =
                                                   
                                                   
                                                         skel.deleteService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), booleanResource102, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "deleteService"));
                                    } else 

            if("createNotProvisionedSharedService".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.LongResource longResource104 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               longResource104 =
                                                   
                                                   
                                                         skel.createNotProvisionedSharedService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), longResource104, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "createNotProvisionedSharedService"));
                                    } else 

            if("editProvisionedService".equals(methodName)){
                
                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource booleanResource106 = null;
	                        de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource wrappedParam =
                                                             (de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               booleanResource106 =
                                                   
                                                   
                                                         skel.editProvisionedService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), booleanResource106, false, new javax.xml.namespace.QName("http://serviceregistry.ba.stutt.de/ServiceRegistry",
                                                    "editProvisionedService"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.BooleanResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(java.lang.String param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(java.lang.String.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.AbstractService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.AbstractService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationWithInterfaceRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationWithInterfaceRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.LongResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.LongResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.CreateServiceInterfaceRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.CreateServiceInterfaceRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, de.stutt.ba.serviceregistry.serviceregistry.BooleanResource param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrapregisterUser(){
                                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.BooleanResource();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, de.stutt.ba.serviceregistry.serviceregistry.AbstractService param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.AbstractService.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.AbstractService wrapsearchByServiceConfiguration(){
                                de.stutt.ba.serviceregistry.serviceregistry.AbstractService wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.AbstractService();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, de.stutt.ba.serviceregistry.serviceregistry.LongResource param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(de.stutt.ba.serviceregistry.serviceregistry.LongResource.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.LongResource wrapcreateServiceConfigurationWithInterface(){
                                de.stutt.ba.serviceregistry.serviceregistry.LongResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.LongResource();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, java.lang.String param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(java.lang.String.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private java.lang.String wraploginUser(){
                                java.lang.String wrappedElement = new java.lang.String();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.LongResource wrapcreateProvisionedService(){
                                de.stutt.ba.serviceregistry.serviceregistry.LongResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.LongResource();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrapeditNotProvisionedDedicatedService(){
                                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.BooleanResource();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.AbstractService wrapsearchByProvider(){
                                de.stutt.ba.serviceregistry.serviceregistry.AbstractService wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.AbstractService();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.LongResource wrapcreateServiceInterface(){
                                de.stutt.ba.serviceregistry.serviceregistry.LongResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.LongResource();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrapeditNotProvisionedSharedService(){
                                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.BooleanResource();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.LongResource wrapcreateServiceConfiguration(){
                                de.stutt.ba.serviceregistry.serviceregistry.LongResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.LongResource();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.AbstractService wrapsearchByQualifiedPortTypeName(){
                                de.stutt.ba.serviceregistry.serviceregistry.AbstractService wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.AbstractService();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.LongResource wrapcreateNotProvisionedDedicatedService(){
                                de.stutt.ba.serviceregistry.serviceregistry.LongResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.LongResource();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrapdeleteService(){
                                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.BooleanResource();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.LongResource wrapcreateNotProvisionedSharedService(){
                                de.stutt.ba.serviceregistry.serviceregistry.LongResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.LongResource();
                                return wrappedElement;
                         }
                    
                         private de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrapeditProvisionedService(){
                                de.stutt.ba.serviceregistry.serviceregistry.BooleanResource wrappedElement = new de.stutt.ba.serviceregistry.serviceregistry.BooleanResource();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.RegisterUserRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (java.lang.String.class.equals(type)){
                
                           return java.lang.String.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.AbstractService.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.AbstractService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationWithInterfaceRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationWithInterfaceRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.LongResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.LongResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.LoginUserRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (java.lang.String.class.equals(type)){
                
                           return java.lang.String.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.CreateProvisionedServiceRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.LongResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.LongResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (java.lang.String.class.equals(type)){
                
                           return java.lang.String.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.AbstractService.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.AbstractService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.CreateServiceInterfaceRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.CreateServiceInterfaceRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.LongResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.LongResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.EditNotProvisionedServiceRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.CreateServiceConfigurationRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.LongResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.LongResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (java.lang.String.class.equals(type)){
                
                           return java.lang.String.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.AbstractService.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.AbstractService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.LongResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.LongResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.LongResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.LongResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.CreateNotProvisionedServiceRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.LongResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.LongResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.EditProvisionedServiceRequestResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.class.equals(type)){
                
                           return de.stutt.ba.serviceregistry.serviceregistry.BooleanResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    