package optic_fusion1.engine.component.entity;

public class SimpleLivingEntity extends LivingEntity {

  private int health;
  private int maxHealth;
  
  public SimpleLivingEntity(String name, int health, int maxHealth) {
    super(name);
    this.health = health;
    this.maxHealth = maxHealth;
  }

  @Override
  public int getHealth() {
    return health;
  }

  @Override
  public int getMaxHealth() {
    return maxHealth;
  }

  @Override
  public void heal(int amount) {
    health += amount;
  }

  @Override
  public void damage(int amount) {
    health -= amount;
  }

  @Override
  public boolean isHurt() {
    return health < maxHealth;
  }

  @Override
  public boolean isDead() {
    return health <= 0;
  }

}
