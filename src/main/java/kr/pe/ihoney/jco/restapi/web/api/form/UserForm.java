package kr.pe.ihoney.jco.restapi.web.api.form;

import kr.pe.ihoney.jco.restapi.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(of={"name", "email"})
public class UserForm {
    private String name;
    private String email;
    private String password;
    
    public User createUser() {
        return new User(this.name, this.email, this.password);
    }
    
    public User bind(User target) {
        target.setName(this.name);
        target.setEmail(this.email);
        target.setPassword(password);
        return target;
    }
}
