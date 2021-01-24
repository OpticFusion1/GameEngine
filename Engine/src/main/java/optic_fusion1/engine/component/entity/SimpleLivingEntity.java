package optic_fusion1.engine.component.entity;

import optic_fusion1.engine.game.Game;

public class SimpleLivingEntity extends LivingEntity {

  private int health;
  private int maxHealth;

  public SimpleLivingEntity(String name, int health, int maxHealth, Game game) {
    super(name, game);
    this.health = health;
    this.maxHealth = maxHealth;
  }

  @Override
  public void tick() {
  }

  @Override
  public void render() {
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
