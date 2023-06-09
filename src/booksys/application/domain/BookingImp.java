/*
 * Restaurant Booking System: example code to accompany
 *
 * "Practical Object-oriented Design with UML"
 * Mark Priestley
 * McGraw-Hill (2004)
 */

package application.domain ;

import java.sql.Date ;
import java.sql.Time ;

public abstract class BookingImp implements Booking
{
  protected int   covers ;
  protected Date  date ;
  protected Time  time ;
  protected Table table ;
  protected Menu menu ;
  protected Time editTime;
  protected int editCovers;
  
  public BookingImp(int c, Date d, Time t, Table tab, Menu m) {
    covers    = c ;
    date      = d ;
    time 	  = t ;
    table     = tab ;
    menu	  = m ;
  }

public Time getArrivalTime() {
    return null ;
  }

  public int getCovers() {
    return covers;
  }
  
  public Date getDate() {
    return date;
  }

  // End time defaults to 2 hours after time of booking
  
  public Time getEndTime() {
    Time endTime = (Time) time.clone() ;
    endTime.setHours(endTime.getHours() + 2) ;
    return endTime ;
  }
  
  public Time getTime() {
    return time;
  }
  
  public Table getTable() {
    return table;
  }

  public int getTableNumber() {
    return table.getNumber() ;
  }
  
  public Menu getMenu() {
    return menu;
  }

  public String getMenuName() {
    return menu.getMName();
  }

  
  public Time getEditTime() {
	    return editTime;
	  }
  public int   getEditCovers() {
	  return editCovers;
	  
  }
   
  
  public void setArrivalTime(Time t) { }

  public void setCovers(int c) {
    covers = c ;
  }

  public void setDate(Date d) {
    date = d ;
  }

  public void setTime(Time t) {
    time = t ;
  }
  
  public void setTable(Table t) {
    table = t ;
  }
  
  public void setMenu(Menu m) {
	  menu = m;
  }
  public void setEditTime(Time t) {
	  time = t ;
  }
  public void setEditCovers(int c) {
	  covers = c;
  }
}
