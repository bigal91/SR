
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package de.stutt.ba.serviceregistry.serviceregistry;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://serviceregistry.ba.stutt.de/ServiceRegistry".equals(namespaceURI) &&
                  "protocolType_type1".equals(typeName)){
                   
                            return  de.stutt.ba.serviceregistry.serviceregistry.ProtocolType_type1.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://serviceregistry.ba.stutt.de/ServiceRegistry".equals(namespaceURI) &&
                  "MapModel".equals(typeName)){
                   
                            return  de.stutt.ba.serviceregistry.serviceregistry.MapModel.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://serviceregistry.ba.stutt.de/ServiceRegistry".equals(namespaceURI) &&
                  "encodeType_type1".equals(typeName)){
                   
                            return  de.stutt.ba.serviceregistry.serviceregistry.EncodeType_type1.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://serviceregistry.ba.stutt.de/ServiceRegistry".equals(namespaceURI) &&
                  "entry_type0".equals(typeName)){
                   
                            return  de.stutt.ba.serviceregistry.serviceregistry.Entry_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://serviceregistry.ba.stutt.de/ServiceRegistry".equals(namespaceURI) &&
                  "protocolType_type1".equals(typeName)){
                   
                            return  de.stutt.ba.serviceregistry.serviceregistry.ProtocolType_type1.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://serviceregistry.ba.stutt.de/ServiceRegistry".equals(namespaceURI) &&
                  "EncodeType".equals(typeName)){
                   
                            return  de.stutt.ba.serviceregistry.serviceregistry.EncodeType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://serviceregistry.ba.stutt.de/ServiceRegistry".equals(namespaceURI) &&
                  "ProtocolType".equals(typeName)){
                   
                            return  de.stutt.ba.serviceregistry.serviceregistry.ProtocolType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    