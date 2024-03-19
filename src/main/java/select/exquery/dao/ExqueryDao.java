package select.exquery.dao;

import java.util.HashMap;
import java.util.List;

public interface ExqueryDao {

    public HashMap<String, Object> selectOne(String id, Object param);

    public List<HashMap<String, Object>> selectList(String id, Object param);


    public int insert(String id, Object param);

    public int update(String id, Object param);

    public int delete(String id, Object param);

}
