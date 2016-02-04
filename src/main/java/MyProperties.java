/**
 * Created by Reshetuyk on 04.02.2016.
 */
public class MyProperties {
    private String idProduct;
    private String f1;
    private String assetClass;
    private String normalizedProductName;
    private String status;

    @Override
    public String toString() {
        return "MyProperties{" +
                "idProduct='" + idProduct + '\'' +
                ", f1='" + f1 + '\'' +
                ", assetClass='" + assetClass + '\'' +
                ", normalizedProductName='" + normalizedProductName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    public String getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    public String getNormalizedProductName() {
        return normalizedProductName;
    }

    public void setNormalizedProductName(String normalizedProductName) {
        this.normalizedProductName = normalizedProductName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
