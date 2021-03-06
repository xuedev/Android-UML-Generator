package software.umlgenerator.data.model.xml;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

import java.util.UUID;

import software.umlgenerator.data.model.parcelables.ParcelableFragment;

/**
 * Created by Caedus on 4/7/2016.
 */
@Root(name = "fragment")
public class FragmentXMLElement /*extends BaseXMLElement<ParcelableFragment>*/ {

    @Attribute(name = "xmi:id")
    String xmiid;

    @Attribute(name = "xmi:type")
    String xmitype = "uml:OccurenceSpecification";

    @Attribute
    String covered;


    public FragmentXMLElement(ParcelableFragment parcelableFragment) {
        //super(parcelableFragment.getName());
        //setData(parcelableFragment);
        xmiid = UUID.randomUUID().toString();
    }

    public void setCovered(String classid) {
        covered = classid;
    }

    public String getXMIID() {
        return xmiid;
    }
}
