package com.param;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.param.Entity.Address;
import com.param.Entity.Employee;
import com.param.Entity.Passport;
import com.param.Entity.Person;
import com.param.Repository.AddRepository;
import com.param.Repository.EmpRespository;
import com.param.Repository.PassportRepository;
import com.param.Repository.PersonRepository;

@SpringBootApplication
public class Mappings01Application {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Mappings01Application.class, args);

	EmpRespository  empRepository=context.getBean(EmpRespository.class);
		AddRepository addrReposiotry = context.getBean(AddRepository.class);

		Employee e = new Employee();
		e.setEmpName("Raja");
		e.setEmpSalary(4000.00);

		Address a1 = new Address();
		a1.setCity("Hyd");
		
		a1.setCountry("India");
		a1.setEmp(e);

		Address a2 = new Address();
		a2.setCity("GNT");
	
		a2.setCountry("India");
		a2.setEmp(e);

		// setting addresses to emp
		List<Address> addrList = Arrays.asList(a1, a2);
		e.setAdress(addrList);
		
		empRepository.save(e);
		
		empRepository.findById(2);
  
//
//		empRepository.deleteById(1);
//		
		System.out.println("Record Inserted............");
	
		
		
		
		
		/*
		PersonRepository psrRepo=context.getBean(PersonRepository.class);
		
		PassportRepository portRepo=context.getBean(PassportRepository.class);
		
		
		Person P= new Person();
		P.setPerson_Name("Parameswar Reddy");
		P.setPerson_Gender("Male");
		
		Passport pt=new Passport();
		
		pt.setPassportName("YMPLCVGF153");
		pt.setIssueDate(LocalDate.now());
		pt.setExpiryDate(LocalDate.now().plusYears(10));
		
		P.setPst(pt);
		
		pt.setPerson(P);
		
		psrRepo.save(P);
		
		
		*/
		
		
		
		
		
		
		
		
		
}
}