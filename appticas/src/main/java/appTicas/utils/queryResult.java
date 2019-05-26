package appTicas.utils;

import java.util.List;

public class queryResult {
    private Integer totalRecords;
    private List<Object> list;

    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public queryResult(Integer totalRecords, List<Object> list) {
        this.totalRecords = totalRecords;
        this.list = list;
    }
}
