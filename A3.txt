//XSD

<?xml version="1.0" encoding="UTF-8" ?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">

<xs:element name="college">
    <xs:complexType>
        <xs:sequence>
            <xs:element name="teachers">
                <xs:complexType>
                    <xs:sequence>
                        <xs:element name="name" type="xs:string" />
                        <xs:element name="address" type="xs:string" minOccurs="1"/>
                        <xs:element name="qualification" type="xs:string" maxOccurs="unbounded"/>
                    </xs:sequence>
                </xs:complexType>
            </xs:element>
            <xs:element name="students">
                <xs:complexType>
                    <xs:sequence>
                        <xs:element name="name" type="xs:string"/>
                        <xs:element name="PRNno" type="xs:double"/>
                    </xs:sequence>
                </xs:complexType>
            </xs:element>
        </xs:sequence>
        <xs:attribute name="clgid" use="required" />
    </xs:complexType>
</xs:element>

</xs:schema>


//XML

<?xml version="1.0" encoding="UTF-8" ?>

<college clgid="123"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:noNamespaceSchemaLocation="assi3.xsd">
    <teachers>
        <name>utkarsha</name>
        <address>pune</address>
        <qualification>phd</qualification>    
    </teachers>
    <students>
        <name>sanskar</name>
        <PRNno>1344</PRNno>
    </students>

</college>

