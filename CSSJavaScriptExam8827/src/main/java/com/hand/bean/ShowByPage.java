package com.hand.bean;
import com.sun.rowset.*; 

public class ShowByPage{
    @SuppressWarnings("restriction")
	CachedRowSetImpl rowSet = null;
    int pageSize = 10;
    int pageAllCount = 0;
    int showPage = 1;
    StringBuffer presentPageResult;
    
    @SuppressWarnings("restriction")
	public void setRowSet(CachedRowSetImpl rowSet){
       this.rowSet = rowSet;
    }
    @SuppressWarnings("restriction")
	public CachedRowSetImpl getRowSet(){
       return rowSet;
    }
    
    public void setPageSize(int pagesize){
       this.pageSize = pagesize;
    }
    public int getPageSize(){
       return pageSize;
    }
    
    public void setPageAllCount(int pageAllCount){
        this.pageAllCount = pageAllCount; 
    }
    public int getPageAllCount(){
       return pageAllCount;
    } 
    
    public void setShowPage(int showPage){
       this.showPage = showPage;
    }
    public int getShowPage(){
       return showPage;
    }
    
    public void setPresentPageResult(StringBuffer presentPageResult){
       this.presentPageResult = presentPageResult; 
    }
    public StringBuffer getPresentPageResult(){
       return presentPageResult; 
    }
}
