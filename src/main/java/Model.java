/**
 * Created by Reshetuyk on 04.02.2016.
 */
public class Model {
    private Integer idProduct;
    private String f1;

    public Model(Integer idProduct, String f1) {
        this.idProduct = idProduct;
        this.f1 = f1;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }
}
