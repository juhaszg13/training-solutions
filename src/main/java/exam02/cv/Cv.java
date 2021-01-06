package exam02.cv;

import java.util.List;

public class Cv {
    private String name;
    private List<Skill> skills;

    public Cv(String name) {
        this.name = name;
    }

    public void addSkills(Skill... skills) {
        for (int i = 0; i < skills.length; i++) {
            this.skills.add(skills[i]);
        }
    }

    public int findSkillLevelByName(String name) {
        for (int i = 0; i < skills.size(); i++) {
            if (name.equals(skills.get(i).getName())) {
                return skills.get(i).getLevel();
            }
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}
