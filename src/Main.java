import Util.CarPresenter;
import Util.CargoPresenter;
import Util.MotorcyclePresenter;

public class Main {
    public static void main(String[] args) {

        CarPresenter carPresenter = new CarPresenter();
        carPresenter.carInvoice();

        MotorcyclePresenter motorcyclePresenter = new MotorcyclePresenter();
        motorcyclePresenter.motorInvoice();

        CargoPresenter cargoPresenter = new CargoPresenter();
        cargoPresenter.cargoInvoice();
    }
}