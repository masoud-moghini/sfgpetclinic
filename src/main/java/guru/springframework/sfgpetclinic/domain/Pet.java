package guru.springframework.sfgpetclinic.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Pet {
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
}
