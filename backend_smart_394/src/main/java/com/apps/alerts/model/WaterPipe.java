package com.apps.alerts.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.apps.alerts.model.Alert;
import com.apps.alerts.model.WaterPipe;
import com.apps.alerts.converter.DurationConverter;
import com.apps.alerts.converter.UUIDToByteConverter;
import com.apps.alerts.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "WaterPipe")
@Table(name = "\"WaterPipe\"", schema =  "\"smart\"")
@Data
                        
public class WaterPipe {
	public WaterPipe () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"Id\"", nullable = true )
  private Integer id;
	  
  @Column(name = "\"Name\"", nullable = true )
  private String name;
  
	  
  @Column(name = "\"Length\"", nullable = true )
  private Integer length;
  
	  
  @Column(name = "\"StartingAt\"", nullable = true )
  private String startingAt;
  
	  
  @Column(name = "\"EndingAt\"", nullable = true )
  private String endingAt;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"WaterPipeAlerts\"",
            joinColumns = @JoinColumn( name="\"Id\""),
            inverseJoinColumns = @JoinColumn( name="\"AId\""), schema = "\"smart\"")
private List<Alert> alerts = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "WaterPipe [" 
  + "Id= " + id  + ", " 
  + "Name= " + name  + ", " 
  + "Length= " + length  + ", " 
  + "StartingAt= " + startingAt  + ", " 
  + "EndingAt= " + endingAt 
 + "]";
	}
	
}