import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
    List addressList;
    Set addressSet;
    Map addressMap;
    Properties addressPro;

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public List getAddressList() {
        System.out.println("List Elements :" + addressList);
        return addressList;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public Set getAddressSet() {
        System.out.println("Set Elements :" + addressSet);
        return addressSet;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public Map getAddressMap() {
        System.out.println("Map Elements :" + addressMap);
        return addressMap;
    }

    public void setAddressPro(Properties addressProp) {
        this.addressPro = addressProp;
    }

    public Properties getAddressPro() {
        System.out.println("Property Elements :" + addressPro);
        return addressPro;
    }
}