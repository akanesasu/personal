package lecture;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class LombokEx {
	@NonNull private String name;
	@NonNull private Integer age;
	private Boolean gender;
	private Double height;
	private Double weight;
	
	LombokEx(String name, int age, boolean gender) {
//		this(name, age, gender, .0, .0);
	} //Cons 2

} //end class