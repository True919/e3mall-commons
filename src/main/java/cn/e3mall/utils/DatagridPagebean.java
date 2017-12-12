package cn.e3mall.utils;

import java.io.Serializable;
import java.util.List;

public class DatagridPagebean implements Serializable {

	private Long totals;
	private List<?>rows;
	public Long getTotals() {
		return totals;
	}
	public void setTotals(Long totals) {
		this.totals = totals;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "DatagridPagebean [totals=" + totals + ", rows=" + rows + "]";
	}
}
