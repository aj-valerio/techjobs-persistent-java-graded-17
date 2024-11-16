package org.launchcode.techjobs.persistent.models.dto;

import jakarta.validation.constraints.NotNull;
import org.launchcode.techjobs.persistent.models.Job;
import org.launchcode.techjobs.persistent.models.Skill;

public class JobSkillDTO {
    @NotNull
    private Job job;

    @NotNull
    private Skill skill;

    public JobSkillDTO(){}

    public @NotNull Job getJob() {
        return job;
    }

    public void setJob(@NotNull Job job) {
        this.job = job;
    }

    public @NotNull Skill getSkill() {
        return skill;
    }

    public void setSkill(@NotNull Skill skill) {
        this.skill = skill;
    }
}
