package br.com.gft.cities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.geo.Point;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "City")
@Table(name = "cidade")
//@TypeDefs(value = {
//		@TypeDef(name = "point", typeClass = PointType.class)
//})
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class City {
	
	@Id
	private Long id;
	
	@Column(name = "nome")
	private String name;
	
	private String uf;
	
	private Integer ibge;
	
//	@Column(name = "lat_lon")
//	private String geolocation;
//	// OU
//	@TypeDef(type=point)
//	@Column(name = "lat_lon", updatable= false, insertable = false)
//	private Point location;
	

}
