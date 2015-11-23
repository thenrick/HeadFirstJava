<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:oraxsl="http://www.oracle.com/XSL/Transform/java"
                xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20"
                xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions"
                xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction"
                xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc"
                xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:ns0="http://xmlns.westarenergy.com/EBM/CreateItem/V1.0"
                xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue"
                xmlns:oracle-xsl-mapper="http://www.oracle.com/xsl/mapper/schemas"
                xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:tns="http://xmlns.westarenergy.com/Common/Logging/V1.0"
                exclude-result-prefixes="xsd xsi oracle-xsl-mapper xsl ns0 tns oraxsl xp20 xref mhdr oraext dvm socket"
                xmlns:ns2="http://schemas.xmlsoap.org/ws/2003/03/addressing"
                xmlns:cmn="http://xmlns.westarenergy.com/core/CommonTypes/V1.0"
                xmlns:ns4="http://xmlns.westarenergy.com/EBO/Item/V1.0"
                xmlns:ns1="http://xmlns.westarenergy.com/WSDL/PPLSFT_CRUD_Item_ABCS_prov/V1.0"
                xmlns:fault="http://xmlns.westarenergy.com/Faults/CommonFaults/V1.0"
                xmlns:ns3="http://xmlns.westarenergy.com/EBM/CommonEBMHeader/V1.0"
                xmlns:bpws="http://docs.oasis-open.org/wsbpel/2.0/process/executable"
                xmlns:plnk="http://docs.oasis-open.org/wsbpel/2.0/plnktype"
                xmlns:ns5="http://xmlns.westarenergy.com/Common/Errors/V1.0"
                xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <oracle-xsl-mapper:schema>
    <!--SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY.-->
    <oracle-xsl-mapper:mapSources>
      <oracle-xsl-mapper:source type="WSDL">
        <oracle-xsl-mapper:schema location="oramds:/apps/WestarEnergy/ABCS/wsdl/PPLSFT_CRUD_Item_ABCS_prov.wsdl"/>
        <oracle-xsl-mapper:rootElement name="CreateItemRequest"
                                       namespace="http://xmlns.westarenergy.com/EBM/CreateItem/V1.0"/>
      </oracle-xsl-mapper:source>
    </oracle-xsl-mapper:mapSources>
    <oracle-xsl-mapper:mapTargets>
      <oracle-xsl-mapper:target type="WSDL">
        <oracle-xsl-mapper:schema location="../WSDLs/PPLSFT_CRUD_Item_ABCS_provWrapper.wsdl"/>
        <oracle-xsl-mapper:rootElement name="LogEvent" namespace="http://xmlns.westarenergy.com/Common/Logging/V1.0"/>
      </oracle-xsl-mapper:target>
    </oracle-xsl-mapper:mapTargets>
    <!--GENERATED BY ORACLE XSL MAPPER 12.1.3.0.0(XSLT Build 140529.0700.0211) AT [WED NOV 11 11:29:23 CST 2015].-->
  </oracle-xsl-mapper:schema>
  <!--User Editing allowed BELOW this line - DO NOT DELETE THIS LINE-->
  <xsl:template match="/">
    <tns:LogEvent>
      <tns:LogInstanceID>
        <xsl:value-of select="oraext:generate-guid ( )"/>
      </tns:LogInstanceID>
      <tns:RequesterApplicationInformation>
        <cmn:Name>
          <xsl:value-of select="/ns0:CreateItemRequest/ns0:EBMHeader/ns3:Sender/ns3:Application"/>
        </cmn:Name>
        <cmn:InstanceID>
          <xsl:value-of select="/ns0:CreateItemRequest/ns0:EBMHeader/ns3:Sender/ns3:SenderMessageID"/>
        </cmn:InstanceID>
        <xsl:if test="">
          <cmn:Timestamp>
            <xsl:value-of select="/ns0:CreateItemRequest/ns0:EBMHeader/ns3:CreationDateTime"/>
          </cmn:Timestamp>
        </xsl:if>
      </tns:RequesterApplicationInformation>
      <tns:Payload>
        <cmn:Payload>
          <xsl:copy-of select="/ns0:CreateItemRequest"/>
        </cmn:Payload>
        <cmn:Type>CreateItemRequestType</cmn:Type>
      </tns:Payload>
      <tns:LogCreationDate>
        <xsl:value-of select="xp20:current-time ( )"/>
      </tns:LogCreationDate>
      <tns:Errors>
        <ns5:Error>
          <ns5:CreationDate>
            <xsl:value-of select="xp20:current-time ( )"/>
          </ns5:CreationDate>
        </ns5:Error>
      </tns:Errors>
    </tns:LogEvent>
  </xsl:template>
</xsl:stylesheet>