package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {
    private String name;
    private List<Skill> skills=new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public void addSkills(String... skills) {
        for (int i = 0; i < skills.length; i++) {
            int occurance=skills[i].indexOf("(");
            String subject=skills[i].substring(0,occurance).trim();
            int level=Integer.parseInt(skills[i].substring(occurance+1,occurance+2));
            this.skills.add(new Skill(subject,level));
        }
    }

    public int findSkillLevelByName(String name) {
        for (int i = 0; i < skills.size(); i++) {
            if (name.equals(skills.get(i).getName())) {
                return skills.get(i).getLevel();
            }
        }
        throw new IllegalArgumentException("Subject not found");
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}
