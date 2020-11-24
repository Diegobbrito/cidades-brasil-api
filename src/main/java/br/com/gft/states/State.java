package br.com.gft.states;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.gft.countries.Country;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "State")
@Table(name = "estado")
//@TypeDefs({
//	@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)	
//})
@Getter @Setter
public class State {

	@Id
	private Long id;
	
	@Column(name = "nome")
	private String name;
	
	private String uf;
	
	private Integer ibge;
	
//	@Column(name = "pais")
//	private Integer countryId;
	
	@ManyToOne
	@JoinColumn(name = "pais", referencedColumnName = "id")
	private Country country;
	
	//Para Postgres com campo json
//	@Type(type = "jsonb")
//	@Basic(fetch = FetchType.LAZY)
//	@Column(name = "ddd", columnDefinition = "jsonb")
//	private List<String>ddd;
	private String ddd;
}
