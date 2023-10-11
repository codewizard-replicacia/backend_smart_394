package com.apps.alerts.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.alerts.model.Alert;
import com.apps.alerts.model.WaterPipe;

@Entity(name = "WaterPipeAlerts")
@Table(schema = "\"smart\"", name = "\"WaterPipeAlerts\"")
@Data
public class WaterPipeAlerts{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"Id\"")
	private Integer id;

    
    @Column(name = "\"AId\"")
    private Long aId;
 
}