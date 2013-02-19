package samples;

import java.util.Map;

import com.adobe.xmp.XMPException;
import com.adobe.xmp.XMPSchemaRegistry;
import com.adobe.xmp.properties.XMPAliasInfo;

public class CCSchemaRegistry implements XMPSchemaRegistry{

	@Override
	public String registerNamespace(String namespaceURI, String suggestedPrefix)
			throws XMPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNamespacePrefix(String namespaceURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNamespaceURI(String namespacePrefix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getNamespaces() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getPrefixes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteNamespace(String namespaceURI) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public XMPAliasInfo resolveAlias(String aliasNS, String aliasProp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XMPAliasInfo[] findAliases(String aliasNS) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XMPAliasInfo findAlias(String qname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getAliases() {
		// TODO Auto-generated method stub
		return null;
	}

}
