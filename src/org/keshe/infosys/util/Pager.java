package org.keshe.infosys.util;

public class Pager {
	private int currentPage;//��ǰҳ��
	private int pageSize=2;//ÿҳ�ļ�¼��˴�����һ����ʼֵ��ÿҳ��ʾ3��
	private int totalSize;//�ܵļ�¼��
	private int totalPage;//�ܵ�ҳ�����ܵļ�¼�����ÿҳ�ļ�¼��õ���totalSize/pageSize
	
	private boolean hasFirst;//�Ƿ��е�һҳ
	private boolean hasPrevious;//�Ƿ�����һҳ
	private boolean hasNext;//�Ƿ�����һҳ
	private boolean hasLast;//�Ƿ������һҳ
	//���캯��ݵ�ǰҳ���ܵļ�¼��	
	public Pager(int currentPage,int totalSize){
		this.currentPage=currentPage;
		this.totalSize=totalSize;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage=currentPage;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize=pageSize;
	}
	
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize=totalSize;
	}
	
	public int getTotalPage() {
		totalPage=totalSize/pageSize;
		if(totalSize%pageSize!=0)
			totalPage++;
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage=totalPage;
	}
	
	public boolean isHasFirst() {
		if(currentPage==1){
			return false;
		}
		return true;
	}
	public void setHasFirst(boolean hasFirst) {
		this.hasFirst=hasFirst;
	}
	
	public boolean isHasPrevious() {
		if(isHasFirst())
			return true;
		else
			return false;
	}
	public void setHasPrevious(boolean hasPrevious) {
		this.hasPrevious=hasPrevious;
	}
	
	public boolean isHasNext() {
		if(isHasLast())
			return true;
		else
			return false;
	}
	public void setHasNext(boolean hasNext) {
		this.hasNext=hasNext;
	}
	
	public boolean isHasLast() {
		if(currentPage==getTotalPage())
			return false;
		else
			return true;
	}
	public void setHasLast(boolean hasLast) {
		this.hasLast=hasLast;
	}
}
