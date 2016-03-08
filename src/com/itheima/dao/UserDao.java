package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.utils.XmlUtils;
import org.dom4j.Document;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by batcave on 16/2/19.
 */
public class UserDao {
    public void save(User user){
        try {
            Document document = XmlUtils.getDocument();

            Element rootElement = document.getRootElement();

            Element userElement = rootElement.addElement("user");
            userElement.addAttribute("id",user.getId());
            userElement.addElement("username",user.getUsername());
            userElement.addElement("password",user.getPassword());
            userElement.addElement("gender",user.getGender());
            userElement.addElement("age",user.getAge());

            XmlUtils.saveXML(document);
        } catch (Exception e) {
          throw new RuntimeException(e);
        }


    }

    public void update(User user){

    }

    public void delete(String id){

    }

    public List<User> findAll(){
        List<User> list = new ArrayList<User>();

        try {

            Document document = XmlUtils.getDocument();

            Element rootElement = document.getRootElement();

            List<Element> allUserElement =  rootElement.elements("user");

            for (Element userElement : allUserElement) {


                list.add(elementToUser(userElement));
            }

            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public User findById(String id){
        System.out.println("id = **** " + id);
        try {
            Document document = XmlUtils.getDocument();
            Element userElement  = (Element)document.selectSingleNode("//user[@id='"+id+"']");

            if (userElement == null) {
                return null;
            }
            System.out.println("userElement = ");
            System.out.println("userElement = " + userElement);
            return elementToUser(userElement);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private User elementToUser(Element userElement){
        String id = userElement.attributeValue("id");
        String username = userElement.element("username").getText();
        String password = userElement.elementText("password");
        String gender = userElement.elementText("gender");
        String age = userElement.elementText("age");

        //System.out.println("id = #####" + id);

        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setGender(gender);
        user.setAge(age);

        return user;
    }

    public User find(String username,String password){
        try {
            Document document = XmlUtils.getDocument();
            Element userElement = (Element) document.selectSingleNode("//user[username='" + username + "' and password= '" + password + "']");
            if (userElement == null) {
                return null;
            }
            return elementToUser(userElement);
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
    }
}
