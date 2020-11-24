package br.com.gft.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pais")
@Getter
@NoArgsConstructor
public class Country {
	
	@Id
	private Long id;
	
	@Column(name = "nome")
	private String name;
	
	@Column(name = "nome_pt")
	private String portugueseName;
	
	@Column(name = "sigla")
	private String code;

	private Integer bacen;
}
