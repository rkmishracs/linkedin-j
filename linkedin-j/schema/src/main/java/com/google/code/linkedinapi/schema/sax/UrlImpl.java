
package com.google.code.linkedinapi.schema.sax;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.code.linkedinapi.schema.Url;

public class UrlImpl
    extends BaseSchemaEntity
    implements Url
{

    protected String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

	@Override
	public void init(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element toXml(Document document) {
		// TODO Auto-generated method stub
		return null;
	}

}
