package chronosacaria.mcdw.configs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class McdwStatsConfig {

    private static final HashMap<String, Float> DAMAGE = new HashMap<>();
    private static final HashMap<String, Float> SPEED = new HashMap<>();
    private static final HashMap<String, Float> RANGE = new HashMap<>();
    private static final HashMap<String, Float> DRAW_SPEED = new HashMap<>();
    private static final HashMap<String, ToolMaterial> MATERIAL = new HashMap<>();

    public static float getDamage(String item) {
        return DAMAGE.getOrDefault(item, 0f);
    }
    public static float getSpeed(String item) {
        if (!SPEED.containsKey(item)) {
            System.out.println(item);
        }
        return SPEED.getOrDefault(item, 0f);
    }
    public static ToolMaterial getMaterial(String item) {
        return MATERIAL.getOrDefault(item, ToolMaterials.IRON);
    }
    public static float getMaxRange(String item) {
        return RANGE.getOrDefault(item, 0f);
    }
    public static float getDrawTime(String item) {
        return DRAW_SPEED.getOrDefault(item, 0f);
    }

    public static void initAll() {
        initMaterial();
        initDamage();
        initSpeed();
        initDrawSpeed();
        initRange();
    }

    public static void initDrawSpeed() {
        DRAW_SPEED.put("bow_ancient_bow", 15f);
        DRAW_SPEED.put("bow_bonebow", 15f);
        DRAW_SPEED.put("bow_burst_gale_bow", 15f);
        DRAW_SPEED.put("bow_echo_of_the_valley", 15f);
        DRAW_SPEED.put("bow_elite_power_bow", 20f);
        DRAW_SPEED.put("bow_green_menace", 15f);
        DRAW_SPEED.put("bow_guardian_bow", 30f);
        DRAW_SPEED.put("bow_haunted_bow", 15f);
        DRAW_SPEED.put("bow_hunters_promise", 15f);
        DRAW_SPEED.put("bow_hunting_bow", 15f);
        DRAW_SPEED.put("bow_longbow", 20f);
        DRAW_SPEED.put("bow_lost_souls", 15f);
        DRAW_SPEED.put("bow_love_spell_bow", 8f);
        DRAW_SPEED.put("bow_masters_bow", 15f);
        DRAW_SPEED.put("bow_mechanical_shortbow", 8f);
        DRAW_SPEED.put("bow_nocturnal_bow", 15f);
        DRAW_SPEED.put("bow_pink_scoundrel", 15f);
        DRAW_SPEED.put("bow_power_bow", 20f);
        DRAW_SPEED.put("bow_purple_storm", 8f);
        DRAW_SPEED.put("bow_red_snake", 30f);
        DRAW_SPEED.put("bow_sabrewing", 15f);
        DRAW_SPEED.put("bow_shivering_bow", 15f);
        DRAW_SPEED.put("bow_shortbow", 8f);
        DRAW_SPEED.put("bow_soul_bow", 15f);
        DRAW_SPEED.put("bow_trickbow", 15f);
        DRAW_SPEED.put("bow_wind_bow", 15f);
        DRAW_SPEED.put("bow_snow_bow", 15f);
        DRAW_SPEED.put("bow_winters_touch", 15f);
    }

    public static void initRange() {
        RANGE.put("bow_ancient_bow", 3.2f);
        RANGE.put("bow_bonebow", 3.2f);
        RANGE.put("bow_burst_gale_bow", 3.2f);
        RANGE.put("bow_echo_of_the_valley", 3.2f);
        RANGE.put("bow_elite_power_bow", 6.4f);
        RANGE.put("bow_green_menace", 3.2f);
        RANGE.put("bow_guardian_bow", 6.4f);
        RANGE.put("bow_haunted_bow", 3.2f);
        RANGE.put("bow_hunters_promise", 3.2f);
        RANGE.put("bow_hunting_bow", 3.2f);
        RANGE.put("bow_longbow", 6.4f);
        RANGE.put("bow_lost_souls", 3.2f);
        RANGE.put("bow_love_spell_bow", 2f);
        RANGE.put("bow_masters_bow", 3.2f);
        RANGE.put("bow_mechanical_shortbow", 2f);
        RANGE.put("bow_nocturnal_bow", 3.2f);
        RANGE.put("bow_pink_scoundrel", 3.2f);
        RANGE.put("bow_power_bow", 6.4f);
        RANGE.put("bow_purple_storm", 2f);
        RANGE.put("bow_red_snake", 6.4f);
        RANGE.put("bow_sabrewing", 3.2f);
        RANGE.put("bow_shivering_bow", 3.2f);
        RANGE.put("bow_shortbow", 2f);
        RANGE.put("bow_soul_bow", 3.2f);
        RANGE.put("bow_trickbow", 3.2f);
        RANGE.put("bow_wind_bow", 3.2f);
        RANGE.put("bow_snow_bow", 3.2f);
        RANGE.put("bow_winters_touch", 3.2f);
    }

    public static void initMaterial() {
        MATERIAL.put("sword_claymore", ToolMaterials.IRON);
        MATERIAL.put("sword_broadsword", ToolMaterials.IRON);
        MATERIAL.put("sword_frost_slayer", ToolMaterials.DIAMOND);
        MATERIAL.put("sword_heartstealer", ToolMaterials.DIAMOND);
        MATERIAL.put("sword_great_axeblade", ToolMaterials.IRON);

        MATERIAL.put("sword_rapier", ToolMaterials.IRON);
        MATERIAL.put("sword_beestinger", ToolMaterials.DIAMOND);
        MATERIAL.put("sword_freezing_foil", ToolMaterials.DIAMOND);

        MATERIAL.put("sword_cutlass", ToolMaterials.IRON);
        MATERIAL.put("sword_nameless_blade", ToolMaterials.DIAMOND);
        MATERIAL.put("sword_dancers_sword", ToolMaterials.IRON);

        MATERIAL.put("sword_katana", ToolMaterials.IRON);
        MATERIAL.put("sword_masters_katana", ToolMaterials.DIAMOND);
        MATERIAL.put("sword_dark_katana", ToolMaterials.NETHERITE);

        MATERIAL.put("sword_iron_sword_var", ToolMaterials.IRON);
        MATERIAL.put("sword_diamond_sword_var", ToolMaterials.DIAMOND);
        MATERIAL.put("sword_hawkbrand", ToolMaterials.IRON);

        MATERIAL.put("axe", ToolMaterials.IRON);
        MATERIAL.put("axe_firebrand", ToolMaterials.DIAMOND);
        MATERIAL.put("axe_highland", ToolMaterials.IRON);

        MATERIAL.put("axe_cursed", ToolMaterials.IRON);
        MATERIAL.put("axe_double", ToolMaterials.IRON);
        MATERIAL.put("axe_whirlwind", ToolMaterials.IRON);

        MATERIAL.put("dagger_dagger", ToolMaterials.IRON);
        MATERIAL.put("dagger_fangs_of_frost", ToolMaterials.IRON);
        MATERIAL.put("dagger_moon", ToolMaterials.IRON);
        MATERIAL.put("dagger_shear_dagger", ToolMaterials.IRON);

        MATERIAL.put("dagger_soul_knife", ToolMaterials.IRON);
        MATERIAL.put("dagger_eternal_knife", ToolMaterials.DIAMOND);
        MATERIAL.put("sword_truthseeker", ToolMaterials.IRON);

        MATERIAL.put("hammer_great", ToolMaterials.IRON);
        MATERIAL.put("hammer_stormlander", ToolMaterials.DIAMOND);
        MATERIAL.put("hammer_gravity", ToolMaterials.DIAMOND);
        MATERIAL.put("hammer_mace", ToolMaterials.IRON);
        MATERIAL.put("hammer_flail", ToolMaterials.IRON);
        MATERIAL.put("hammer_suns_grace", ToolMaterials.DIAMOND);

        MATERIAL.put("dagger_tempest_knife", ToolMaterials.IRON);
        MATERIAL.put("dagger_resolute_tempest_knife", ToolMaterials.IRON);
        MATERIAL.put("dagger_chill_gale_knife", ToolMaterials.IRON);

        MATERIAL.put("gauntlet_gauntlet", ToolMaterials.IRON);
        MATERIAL.put("gauntlet_fighters_bindings", ToolMaterials.IRON);
        MATERIAL.put("gauntlet_maulers", ToolMaterials.DIAMOND);
        MATERIAL.put("gauntlet_soul_fists", ToolMaterials.NETHERITE);

        MATERIAL.put("sickle_sickle", ToolMaterials.IRON);
        MATERIAL.put("sickle_nightmares_bite", ToolMaterials.IRON);
        MATERIAL.put("sickle_last_laugh_gold", ToolMaterials.GOLD);
        MATERIAL.put("sickle_last_laugh_silver", ToolMaterials.GOLD);

        MATERIAL.put("sickle_jailors_scythe", ToolMaterials.IRON);
        MATERIAL.put("sickle_soul_scythe", ToolMaterials.DIAMOND);
        MATERIAL.put("sickle_frost_scythe", ToolMaterials.IRON);

        MATERIAL.put("pick_diamond_pickaxe_var", ToolMaterials.DIAMOND);
        MATERIAL.put("pick_mountaineer_pick", ToolMaterials.IRON);
        MATERIAL.put("pick_howling_pick", ToolMaterials.IRON);
        MATERIAL.put("pick_hailing_pinnacle", ToolMaterials.DIAMOND);

        MATERIAL.put("spear_glaive", ToolMaterials.IRON);
        MATERIAL.put("spear_grave_bane", ToolMaterials.IRON);
        MATERIAL.put("spear_venom_glaive", ToolMaterials.IRON);

        MATERIAL.put("spear_spear", ToolMaterials.IRON);
        MATERIAL.put("spear_whispering_spear", ToolMaterials.IRON);
        MATERIAL.put("spear_fortune", ToolMaterials.GOLD);

        MATERIAL.put("staff_battlestaff", ToolMaterials.WOOD);
        MATERIAL.put("staff_growing_staff", ToolMaterials.IRON);
        MATERIAL.put("staff_battlestaff_of_terror", ToolMaterials.IRON);

        MATERIAL.put("whip_whip", ToolMaterials.IRON);
        MATERIAL.put("whip_vine_whip", ToolMaterials.IRON);

        MATERIAL.put("bow_ancient_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_bonebow", ToolMaterials.WOOD);
        MATERIAL.put("bow_burst_gale_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_echo_of_the_valley", ToolMaterials.WOOD);
        MATERIAL.put("bow_elite_power_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_green_menace", ToolMaterials.WOOD);
        MATERIAL.put("bow_guardian_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_haunted_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_hunters_promise", ToolMaterials.WOOD);
        MATERIAL.put("bow_hunting_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_longbow", ToolMaterials.WOOD);
        MATERIAL.put("bow_lost_souls", ToolMaterials.WOOD);
        MATERIAL.put("bow_love_spell_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_masters_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_mechanical_shortbow", ToolMaterials.WOOD);
        MATERIAL.put("bow_nocturnal_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_pink_scoundrel", ToolMaterials.WOOD);
        MATERIAL.put("bow_power_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_purple_storm", ToolMaterials.WOOD);
        MATERIAL.put("bow_red_snake", ToolMaterials.WOOD);
        MATERIAL.put("bow_sabrewing", ToolMaterials.WOOD);
        MATERIAL.put("bow_shivering_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_shortbow", ToolMaterials.WOOD);
        MATERIAL.put("bow_soul_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_trickbow", ToolMaterials.WOOD);
        MATERIAL.put("bow_wind_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_snow_bow", ToolMaterials.WOOD);
        MATERIAL.put("bow_winters_touch", ToolMaterials.WOOD);
    }

    public static void initDamage() {
        //Claymores
        DAMAGE.put("sword_claymore", 5f);
        DAMAGE.put("sword_broadsword", 4f);
        DAMAGE.put("sword_frost_slayer", 5f);
        DAMAGE.put("sword_heartstealer", 4f);
        DAMAGE.put("sword_great_axeblade", 6f);

        //Rapiers
        DAMAGE.put("sword_rapier", 0f);
        DAMAGE.put("sword_beestinger", 0f);
        DAMAGE.put("sword_freezing_foil", 0f);

        //Curves
        DAMAGE.put("sword_cutlass", 3f);
        DAMAGE.put("sword_nameless_blade", 1f);
        DAMAGE.put("sword_dancers_sword", 1f);

        //Katanas
        DAMAGE.put("sword_katana", 1f);
        DAMAGE.put("sword_masters_katana", 0f);
        DAMAGE.put("sword_dark_katana", 0f);

        //Swords
        DAMAGE.put("sword_iron_sword_var", 3f);
        DAMAGE.put("sword_diamond_sword_var", 3f);
        DAMAGE.put("sword_hawkbrand", 5f);

        //Axes
        DAMAGE.put("axe", 6f);
        DAMAGE.put("axe_firebrand", 5f);
        DAMAGE.put("axe_highland", 6f);

        DAMAGE.put("axe_double", 6f);
        DAMAGE.put("axe_cursed", 7f);
        DAMAGE.put("axe_whirlwind", 6f);

        DAMAGE.put("dagger_dagger", 1f);
        DAMAGE.put("dagger_fangs_of_frost", 1f);
        DAMAGE.put("dagger_moon", 1f);
        DAMAGE.put("dagger_shear_dagger", 1f);

        DAMAGE.put("dagger_soul_knife", 1f);
        DAMAGE.put("dagger_eternal_knife", 0f);
        DAMAGE.put("sword_truthseeker", 3f);

        DAMAGE.put("hammer_great", 4f);
        DAMAGE.put("hammer_stormlander", 5f);
        DAMAGE.put("hammer_gravity", 5f);
        DAMAGE.put("hammer_mace", 4f);
        DAMAGE.put("hammer_flail", 5f);
        DAMAGE.put("hammer_suns_grace", 4f);

        DAMAGE.put("dagger_tempest_knife", 2f);
        DAMAGE.put("dagger_resolute_tempest_knife", 3f);
        DAMAGE.put("dagger_chill_gale_knife", 4f);

        DAMAGE.put("gauntlet_gauntlet", 0f);
        DAMAGE.put("gauntlet_fighters_bindings", 0f);
        DAMAGE.put("gauntlet_maulers", 0f);
        DAMAGE.put("gauntlet_soul_fists", 0f);

        DAMAGE.put("sickle_sickle", 1f);
        DAMAGE.put("sickle_nightmares_bite", 3f);
        DAMAGE.put("sickle_last_laugh_gold", 4f);
        DAMAGE.put("sickle_last_laugh_silver", 4f);

        DAMAGE.put("sickle_jailors_scythe", 4f);
        DAMAGE.put("sickle_soul_scythe", 3f);
        DAMAGE.put("sickle_frost_scythe", 4f);

        DAMAGE.put("pick_diamond_pickaxe_var", 1f);
        DAMAGE.put("pick_mountaineer_pick", 1f);
        DAMAGE.put("pick_howling_pick", 1f);
        DAMAGE.put("pick_hailing_pinnacle", 1f);

        DAMAGE.put("spear_glaive", 3f);
        DAMAGE.put("spear_grave_bane", 5f);
        DAMAGE.put("spear_venom_glaive", 5f);

        DAMAGE.put("spear_spear", 3f);
        DAMAGE.put("spear_whispering_spear", 5f);
        DAMAGE.put("spear_fortune", 4f);

        DAMAGE.put("staff_battlestaff", 0f);
        DAMAGE.put("staff_growing_staff", 1f);
        DAMAGE.put("staff_battlestaff_of_terror", 0f);
        DAMAGE.put("whip_whip", 2f);
        DAMAGE.put("whip_vine_whip", 5f);
    }

    public static void initSpeed() {
        SPEED.put("sword_claymore", -3f);
        SPEED.put("sword_broadsword", -3f);
        SPEED.put("sword_frost_slayer", -3f);
        SPEED.put("sword_heartstealer", -3f);
        SPEED.put("sword_great_axeblade", -3f);

        SPEED.put("sword_rapier", -0.9f);
        SPEED.put("sword_beestinger", -0.9f);
        SPEED.put("sword_freezing_foil", -0.9f);

        SPEED.put("sword_cutlass", -2.7f);
        SPEED.put("sword_nameless_blade", -1.7f);
        SPEED.put("sword_dancers_sword", -1.0f);

        SPEED.put("sword_katana", -1.5f);
        SPEED.put("sword_masters_katana", -1.1f);
        SPEED.put("sword_dark_katana", -1.15f);

        SPEED.put("sword_iron_sword_var", -2.4f);
        SPEED.put("sword_diamond_sword_var", -2.4f);
        SPEED.put("sword_hawkbrand", -2.0f);

        SPEED.put("axe", -3.1f);
        SPEED.put("axe_firebrand", -2.9f);
        SPEED.put("axe_highland", -3.1f);

        SPEED.put("dagger_dagger", -1.3f);
        SPEED.put("dagger_fangs_of_frost", -1.0f);
        SPEED.put("dagger_moon", -1.0f);
        SPEED.put("dagger_shear_dagger", -1.3f);

        SPEED.put("axe_double", -3.1f);
        SPEED.put("axe_cursed", -3.1f);
        SPEED.put("axe_whirlwind", -2.9f);

        SPEED.put("dagger_soul_knife", -1.1f);
        SPEED.put("dagger_eternal_knife", -0.9f);
        SPEED.put("sword_truthseeker", -1.5f);

        SPEED.put("hammer_great", -3.0f);
        SPEED.put("hammer_stormlander", -3.0f);
        SPEED.put("hammer_gravity", -3.0f);
        SPEED.put("hammer_mace", -2.9f);
        SPEED.put("hammer_flail", -2.9f);
        SPEED.put("hammer_suns_grace", -2.5f);

        SPEED.put("dagger_tempest_knife", -1.3f);
        SPEED.put("dagger_resolute_tempest_knife", -1.3f);
        SPEED.put("dagger_chill_gale_knife", -1.3f);

        SPEED.put("gauntlet_gauntlet", -1.4f);
        SPEED.put("gauntlet_fighters_bindings", -1.4f);
        SPEED.put("gauntlet_maulers", -1.4f);
        SPEED.put("gauntlet_soul_fists", -1.4f);

        SPEED.put("sickle_sickle", -1.9f);
        SPEED.put("sickle_nightmares_bite", -1.9f);
        SPEED.put("sickle_last_laugh_gold", -1.9f);
        SPEED.put("sickle_last_laugh_silver", -1.9f);

        SPEED.put("sickle_jailors_scythe", -2.25f);
        SPEED.put("sickle_soul_scythe", -2.25f);
        SPEED.put("sickle_frost_scythe", -2.5f);

        SPEED.put("pick_diamond_pickaxe_var", -2.8f);
        SPEED.put("pick_mountaineer_pick", -2.8f);
        SPEED.put("pick_howling_pick", -2.8f);
        SPEED.put("pick_hailing_pinnacle", -2.8f);

        SPEED.put("spear_glaive", -2.7f);
        SPEED.put("spear_grave_bane", -2.4f);
        SPEED.put("spear_venom_glaive", -2.5f);

        SPEED.put("spear_spear", -2.5f);
        SPEED.put("spear_whispering_spear", -2.5f);
        SPEED.put("spear_fortune", -2.15f);

        SPEED.put("staff_battlestaff", -0.1f);
        SPEED.put("staff_growing_staff", -0.1f);
        SPEED.put("staff_battlestaff_of_terror", -0.1f);
        SPEED.put("whip_whip", -3.1f);
        SPEED.put("whip_vine_whip", -3.1f);
    }

    public static void generateConfigs(boolean overwrite) {
        StringBuilder config = new StringBuilder("{\n");
        int i = 0;
        for (String item : DAMAGE.keySet()) {
            config.append("  \"").append(item).append("\": ").append(DAMAGE.get(item));
            ++i;
            if (i < DAMAGE.size()) {
                config.append(",");
            }
            config.append("\n");
        }
        config.append("}");
        McdwBaseConfig.createFile("config/minecraft_dungeon_weapons/damage_config.json5", config.toString(), overwrite);

        config = new StringBuilder("{\n");
        i = 0;
        for (String item : SPEED.keySet()) {
            config.append("  \"").append(item).append("\": ").append(SPEED.get(item));
            ++i;
            if (i < SPEED.size()) {
                config.append(",");
            }
            config.append("\n");
        }
        config.append("}");
        McdwBaseConfig.createFile("config/minecraft_dungeon_weapons/attack_speed_config.json5", config.toString(), overwrite);

        config = new StringBuilder("{\n");
        i = 0;
        for (String item : MATERIAL.keySet()) {
            config.append("  \"").append(item).append("\": ").append(materialToString(MATERIAL.get(item)));
            ++i;
            if (i < MATERIAL.size()) {
                config.append(",");
            }
            config.append("\n");
        }
        config.append("}");
        McdwBaseConfig.createFile("config/minecraft_dungeon_weapons/materials_config.json5", config.toString(), overwrite);

        config = new StringBuilder("{\n");
        i = 0;
        for (String item : DRAW_SPEED.keySet()) {
            config.append("  \"").append(item).append("\": ").append(DRAW_SPEED.get(item));
            ++i;
            if (i < DRAW_SPEED.size()) {
                config.append(",");
            }
            config.append("\n");
        }
        config.append("}");
        McdwBaseConfig.createFile("config/minecraft_dungeon_weapons/draw_speed_config.json5", config.toString(), overwrite);

        config = new StringBuilder("{\n");
        i = 0;
        for (String item : RANGE.keySet()) {
            config.append("  \"").append(item).append("\": ").append(RANGE.get(item));
            ++i;
            if (i < RANGE.size()) {
                config.append(",");
            }
            config.append("\n");
        }
        config.append("}");
        McdwBaseConfig.createFile("config/minecraft_dungeon_weapons/range_config.json5", config.toString(), overwrite);
    }

    private static ToolMaterial stringToMaterial(String material) {
        switch (material) {
            case "wood":
                return ToolMaterials.WOOD;
            case "stone":
                return ToolMaterials.STONE;
            case "gold":
                return ToolMaterials.GOLD;
            case "diamond":
                return ToolMaterials.DIAMOND;
            case "netherite":
                return ToolMaterials.NETHERITE;
            default:
                return ToolMaterials.IRON;
        }
    }

    private static String materialToString(ToolMaterial toolMaterial) {
        if (toolMaterial == ToolMaterials.WOOD) {
            return "wood";
        } else if (toolMaterial == ToolMaterials.STONE) {
            return "stone";
        } else if (toolMaterial == ToolMaterials.GOLD) {
            return "gold";
        } else if (toolMaterial == ToolMaterials.IRON) {
            return "iron";
        } else if (toolMaterial == ToolMaterials.DIAMOND) {
            return "diamond";
        } else if (toolMaterial == ToolMaterials.NETHERITE) {
            return "netherite";
        } else {
            return "none";
        }
    }

    public static void loadConfig() {
        JsonObject json;
        json = McdwBaseConfig.getJsonObject(McdwBaseConfig.readFile(new File("config/minecraft_dungeon_weapons/damage_config.json5")));
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            DAMAGE.put(entry.getKey(), entry.getValue().getAsFloat());
        }

        json = McdwBaseConfig.getJsonObject(McdwBaseConfig.readFile(new File("config/minecraft_dungeon_weapons/attack_speed_config.json5")));
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            SPEED.put(entry.getKey(), entry.getValue().getAsFloat());
        }

        json = McdwBaseConfig.getJsonObject(McdwBaseConfig.readFile(new File("config/minecraft_dungeon_weapons/materials_config.json5")));
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            MATERIAL.put(entry.getKey(), stringToMaterial(entry.getValue().getAsString()));
        }

        json = McdwBaseConfig.getJsonObject(McdwBaseConfig.readFile(new File("config/minecraft_dungeon_weapons/draw_speed_config.json5")));
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            DRAW_SPEED.put(entry.getKey(), entry.getValue().getAsFloat());
        }

        json = McdwBaseConfig.getJsonObject(McdwBaseConfig.readFile(new File("config/minecraft_dungeon_weapons/range_config.json5")));
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            RANGE.put(entry.getKey(), entry.getValue().getAsFloat());
        }
    }

}