'''sql
CREATE TABLE IF NOT EXISTS `${FractalType}` (
	`fractal_type_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 
	`name` TEXT, 
	`fragment_class` TEXT, 
	`value_multiplier` INTEGER NOT NULL, 
	`time_spent` INTEGER NOT NULL
);

CREATE TABLE IF NOT EXISTS `${Snapshot}` (
	`snapshot_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 
	`value` INTEGER NOT NULL, 
	`user_id` INTEGER NOT NULL,  
	FOREIGN KEY(`user_id`) REFERENCES `User`(`user_id`) ON UPDATE NO ACTION ON DELETE CASCADE , 
	FOREIGN KEY(`fractal_type_id`) REFERENCES `FractalType`(`fractal_type_id`) ON UPDATE NO ACTION ON DELETE CASCADE 
);

CREATE TABLE IF NOT EXISTS `${User}` (
	`user_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 
	`first_name` TEXT, 
	`last_name` TEXT
);
'''