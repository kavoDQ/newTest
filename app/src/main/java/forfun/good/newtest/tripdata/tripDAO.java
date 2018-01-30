package forfun.good.newtest.tripdata;

import java.util.ArrayList;

/**
 * Created by Student on 2018/1/30.
 */

public interface tripDAO {
    public boolean add(trip_constructor t);
    public ArrayList<trip_constructor> getList();
    public trip_constructor getTrip(int id);
    public boolean update(trip_constructor t);
    public boolean delete(int id);
}

