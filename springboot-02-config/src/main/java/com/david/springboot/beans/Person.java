package com.david.springboot.beans;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties:告诉spring boot将本类中的所有属性和配置文件中相关的配置进行绑定，但是默认情况下是从
 * 全局配置文件中获取，如果所有配置都写在全局配置文件中，可能导致全局配置文件特别大。可以使用@PropertySource来指定加载配置文件的
 * 位置
 * prefix = "person":意思是配置文件中那个属性下的所有属性进行一一映射
 * 只有这个组件是在容器中的组件，才能容器提供的@ConfigurationProperties功能
 * ConfigurationProperties注解支持SR303数据校验，而@value不支持
 * @author david
 * @create 2019-03-30 22:11
 */
//@PropertySource(value = {"classpath:person.properties"})
@Component

@ConfigurationProperties(prefix = "person")

@Validated//启动rs303的校验
public class Person {
    /*
        @Value("")这个注解和xml中bean标签中的属性配置时候的value标签类似，也支持字面量
        ${key}从环境变量，配置文件中取值。#{SPEL}也支持
     */
   // @Value("${person.last-name}")

    //@Email// SR303校验，表示lastname必须是邮箱地址格式
    private String lastName;
//    @Value("#{11*2}")//spel
    private Integer age;
//    @Value("true")
    private Boolean boss;

    private Date    birth;

    private Map<String,Object> maps;
    private List<Object> lsits;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLsits() {
        return lsits;
    }

    public void setLsits(List<Object> lsits) {
        this.lsits = lsits;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lsits=" + lsits +
                ", dog=" + dog +
                '}';
    }
}
