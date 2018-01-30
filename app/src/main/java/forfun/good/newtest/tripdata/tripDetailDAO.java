package forfun.good.newtest.tripdata;

import java.util.ArrayList;

public interface tripDetailDAO{
    public boolean add(tripadd_constructor t);
    public ArrayList<tripadd_constructor> getList();
    public tripadd_constructor getTrip(int id);
    public boolean update(tripadd_constructor t);
    public boolean delete(int id);
}
