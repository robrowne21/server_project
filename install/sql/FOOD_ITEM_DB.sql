create table FOOD_ITEM_DB (
	id NUMBER(10) NOT NULL,
	food_name VARCHAR(255) NOT NULL,
	food_brand VARCHAR(255) NULL,
	calories NUMBER(10) NOT NULL,
	carbs NUMBER(10) NOT NULL,
	sugars NUMBER(10) NULL,
	fat NUMBER(10) NOT NULL,
	sat_fat NUMBER(10) NULL,
	protein NUMBER(10) NOT NULL
)