SET NAMES utf8;
set CHARSET utf8;

INSERT into categories (name)
VALUES ('produce'),
  ('meats'),
  ('seasonings'),
  ('dry-goods'),
  ('dairy'),
  ('frozen'),
  ('condiments');

INSERT INTO ingredients (ingredient, categories_id)
VALUES ('boneless chicken breast', 2),
  ('ground beef', 2),
  ('ground pork', 2),
  ('sausage', 2),
  ('bacon', 2),
  ('italian sausage', 2),
  ('pork chops', 2),
  ('bratwurst', 2),
  ('hot dogs', 2),
  ('stew meat', 2),
  ('ribeye', 2),
  ('strip steak', 2),
  ('boneless chicken thighs', 2),
  ('chicken', 2),
  ('tuna', 2),
  ('salmon', 2),
  ('shrimp', 2),
  ('catfish', 2),
  ('ham', 2),
  ('pork roast', 2),
  ('tomatoes', 1),
  ('potatoes', 1),
  ('carrots', 1),
  ('celery', 1),
  ('onions', 1),
  ('apples', 1),
  ('oranges', 1),
  ('bananas', 1),
  ('corn', 1),
  ('peas', 1),
  ('broccoli', 1),
  ('mushrooms', 1),
  ('spinach', 1),
  ('red bell peppers', 1),
  ('yellow bell peppers', 1),
  ('green bell peppers', 1),
  ('zucchini', 1),
  ('asparagus', 1),
  ('summer squash', 1),
  ('spaghetti squash', 1),
  ('artichokes', 1),
  ('basil', 3),
  ('oregano', 3),
  ('minced garlic', 3),
  ('garlic', 3),
  ('garlic powder', 3),
  ('thyme leaves', 3),
  ('ground thyme', 3),
  ('rosemary', 3),
  ('onion powder', 3),
  ('ground sage', 3),
  ('marjoram', 3),
  ('ground mustard', 3),
  ('cilantro', 3),
  ('parsley', 3),
  ('cinnamon', 3),
  ('turmeric', 3),
  ('ginger', 3),
  ('ground cloves', 3),
  ('allspice', 3),
  ('bay leaves', 3),
  ('cayenne pepper', 3),
  ('chili powder', 3),
  ('salt', 3),
  ('pepper', 3),
  ('cumin', 3),
  ('nutmeg', 3),
  ('paprika', 3),
  ('crushed red pepper', 3),
  ('vanilla extract', 3),
  ('taco seasoning', 3),
  ('chicken taco seasoning', 3),
  ('spaghetti', 4),
  ('macaroni', 4),
  ('penne pasta', 4),
  ('linguine', 4),
  ('lasagna noodles', 4),
  ('kidney beans', 4),
  ('navy beans', 4),
  ('black beans', 4),
  ('diced green chilis', 4),
  ('hot dog buns', 4),
  ('hamburger buns', 4),
  ('french bread', 4),
  ('flour tortillas', 4),
  ('corn tortillas', 4),
  ('corn bread', 4),
  ('tortilla chips', 4),
  ('potato chips', 4),
  ('brown gravy mix', 4),
  ('country gravy mix', 4),
  ('flour', 4),
  ('sugar', 4),
  ('yeast', 4),
  ('olive oil', 4),
  ('vegetable oil', 4),
  ('applesauce', 4),
  ('orange marmalade', 4),
  ('diced tomatoes', 4),
  ('tomato sauce', 4),
  ('tomato paste', 4),
  ('chicken broth', 4),
  ('beef broth', 4),
  ('vegetable juice', 4),
  ('chicken noodle soup mix', 4),
  ('broccoli cheese soup mix', 4),
  ('vegetable shortening', 4),
  ('marinara sauce', 4),
  ('alfredo sauce', 4),
  ('pizza sauce', 4),
  ('sun dried tomato pasta sauce', 4),
  ('pancake mix', 4),
  ('syrup', 4),
  ('grated parmesan', 5),
  ('shredded parmesan', 5),
  ('shredded mozzerella', 5),
  ('shreded colby jack', 5),
  ('shredded cheddar', 5),
  ('sour cream', 5),
  ('eggs', 5),
  ('whipping cream', 5),
  ('heavy cream', 5),
  ('milk', 5),
  ('biscuits', 5),
  ('pie crust', 5),
  ('yogurt', 5 ),
  ('cream cheese', 5),
  ('ravioli', 6),
  ('spinach', 6),
  ('corn', 6),
  ('peas', 6),
  ('mixed vegetables', 6),
  ('broccoli', 6),
  ('strawberries', 6),
  ('french fries', 6),
  ('hashbrowns', 6),
  ('pizza', 6),
  ('ketchup', 7),
  ('mustard', 7),
  ('mayonaise', 7),
  ('bbq sauce', 7),
  ('ranch dressing', 7),
  ('honey mustard', 7),
  ('garlic and herb marinade', 7),
  ('sesame chicken marinade', 7),
  ('black olives', 7),
  ('dill pickles', 7),
  ('water', 4),
  ('italian seasoning', 3),
  ('romaine lettuce', 1),
  ('feta cheese', 5),
  ('rotel tomatoes', 4),
  ('baking powder', 4),
  ('butter', 5),
  ('egg noodles', 4),
  ('bread crumbs', 4),
  ('rice (white)', 4),
  ('rice (long grain and wild', 4),
  ('rice (brown)', 4),
  ('sandwich bread', 4),
  ('soy sauce', 7),
  ('orange juice', 5),
  ('baked beans', 4),
  ('sliced cheese',5),
  ('peperoni', 5),
  ('cornmeal', 4),
  ('pork tenderloin', 2),
  ('brown sugar', 4),
  ('strawberries', 1),
  ('blueberries', 1),
  ('lime juice', 1),
  ('lemon juice', 1),
  ('lemons', 1),
  ('cucumber', 1),
  ('white wine vinegar', 4),
  ('apple cider', 1),
  ('salsa', 4),
  ('enchilada sauce', 4);

INSERT INTO recipes (cook_time, image, instruction, prep_time, season, title)
VALUES (30, 'tuscan-pasta.jpg',
        '1. Prepare pasta according to package directions.
         2. Meanwhile, pour Alfredo sauce into a medium saucepan. Pour wine into sauce jar; cover tightly, and shake well.
            Stir wine mixture into saucepan. Stir in chopped tomatoes and 1/2 cup chopped basil, and cook over medium-low
            heat 5 minutes or until thoroughly heated. Toss with pasta, and top evenly with 1/3 cup grated Parmesan cheese.
            Garnish, if desired.
            *1 (13-oz.) package three-cheese tortellini may be substituted.
            **1 (14.5-oz.) can petite diced tomatoes, fully drained, may be substituted.
            Note: For testing purposes only, we used Buitoni Four Cheese Ravioli and Classico Sun-dried Tomato Alfredo Pasta Sauce.',
        15, 1, 'Tuscan Pasta With Tomato-Basil Cream'),
  (30, 'spaghetti-olives.jpg',
   'In a large glass or stainless-steel bowl, combine the tomatoes, olives, feta, capers, parsley, salt, and pepper.
    In a large pot of boiling, salted water, cook the spaghetti until just done, about 12 minutes. Drain.
    Meanwhile, in a medium frying pan, heat the olive oil over moderately low heat. Add the garlic and cook, stirring,
    for 1 minute. Add the cooked pasta and the garlic oil to the tomato mixture and toss.',
   15, 1, 'Spaghetti with Tomatoes, Black Olives, Garlic, and Feta Cheese'),
  (480, 'ham-beans.jpg',
   'Rinse and sort the beans for any pebbles. Add the the rinsed beans, onion powder, salt, pepper, and ham to the
   crock pot. Add water. Cover and cook on low about 8 hours, until beans are tender. Remove ham bone, shanks or hocks
   and pull off the meat. Add meat to the crock pot and mix. Serve with cornbread.',
   15, 2, 'Ham and Beans'),
  (10, 'mediterranean-pizza-skillet.jpg',
   'In a 10-inch skillet cook and stir chicken and garlic in hot oil over medium heat for 2 to 5 minutes or until chicken
   is brown. Stir in tomato, artichoke hearts, olives, Italian seasoning, and pepper. Bring to boiling; reduce heat.
   Simmer, covered, about 10 minutes or until chicken is no longer pink. Top with lettuce and cheese. Cook, covered,
   for 1 to 2 minutes more or until lettuce starts to wilt. Sprinkle with basil and serve on or with bread. Makes 4 servings.',
   20, 1, 'Mediterranean Pizza Skillet'),
  (600, 'chicken-taco-chili.jpg',
   'Combine beans, onion, chili peppers, corn, tomato sauce, cumin, chili powder and taco seasoning in a slow cooker.
   Place chicken on top and cover. Cook on low for 10 hours or on high for 6 hours. Half hour before serving, remove
   chicken and shred. Return chicken to slow cooker and stir in. Top with fresh cilantro. Also try it with low fat cheese and sour cream',
   5, 2, 'Crock Pot Chicken Taco Chili'),
  (30, 'spaghetti-with-shrimp-and-grape-tomatoes.jpg',
   'Bring a large pot of salted water to boil. Season chicken generously with salt, pepper, oregano and basil. Heat a
   large skillet on high heat. When hot, spray with oil and add chicken. Cook about 3-4 minutes, until no longer pink.
   Remove chicken and set aside. Add pasta and cook according to package directions. Reserve about 1/2 cup pasta water
   before draining. While pasta cooks, add olive oil to skillet on high heat. Add garlic and sauté until golden brown
   (do not burn). Add tomatoes, salt and pepper and reduce heat to medium-low. Sauté about 4-5 minutes. When pasta is
   drained, add pasta to tomatoes and toss well. If pasta seems too dry, add some of the reserved pasta water. Add fresh
    basil and chicken and toss well. Serve and top with good grated cheese.',
   5, 1, 'Spaghetti with Shrimp and Grape Tomatoes'),
  (30, 'chicken-and-dumplings.jpg',
   'In a bowl, combine the flour, baking powder and salt. Cut the butter into the dry ingredients with a fork or pastry
    blender. Stir in the milk, mixing with a fork until the dough forms a ball. Heavily flour a work surface. You’ll
    need a rolling pin and something to cut the dumplings with. I like to use a pizza cutter. I also like to use a small
    spatula to lift the dumplings off the cutting surface. Roll the dough out thin with a heavily floured rolling pin.
    Dip your cutter in flour and cut the dumplings in squares about 2″x2″. It’s okay for them not to be exact. Just eye
    ball it. Some will be bigger, some smaller, some shaped funny. Use the floured spatula to put them on a heavily
    floured plate. Just keep flouring between the layers of dumplings. To cook them, bring the broth to a boil. Drop
    the dumplings in one at a time, stirring while you add them. The extra flour on them will help thicken the broth.
    Cook them for about 15-20 minutes or until they not doughy tasting. Add the cooked chicken to the pot and you’re done!',
   20, 2, 'Homemade Chicken and Dumplings'),
  (30, 'italian-sausage-pasta.jpg',
   'Cook pasta according to package directions. Heat spaghetti sauce, sausage, garlic, and vegetables for about 12 minutes,
   until veggies are tender. Top pasta with sauce mixture and sprinkle with cheese.',
   10, 1, 'Italian Sausage and Veggie Pasta'),
  (30, 'chicken-and-noodles.jpg',
   '1. Preheat oven to 450 degrees F. In a Dutch oven bring 6 cups salted water to boiling; add noodles. Cook for 10 minutes
   or until tender; drain. Meanwhile, remove chicken from bones. Discard skin and bones; shred chicken. In a saucepan
   combine chicken, peas, garlic, and whole milk; heat through. Cover and keep warm. In a small bowl combine bread crumbs,
   1/4 cup of the Parmesan cheese, and melted butter. Stir noodles and remaining Parmesan cheese into hot chicken mixture.
   Heat and stir until bubbly. Divide among four individual casserole dishes. Top each with some of the bread crumb mixture.
   Bake for 5 minutes or until top begins to brown. If desired, top with fresh thyme',
   10, 1, 'Garlic Parmesan Chicken and Noodles'),
  (20, 'barbecue-quesadillas.jpg',
   '1. Coat one side of each tortilla with cooking spray. Place, coated sides down, on cutting board or parchment paper.
   Sprinkle 1/4 cup of the cheese over half of each tortilla. Top with green chiles and barbecue sauce with chicken. Fold
   tortillas in half, pressing gently. Preheat oven to 350. In a hot 10-inch skillet cook quesadillas, two at a time, over
   medium heat for 6 to 8 minutes or until golden brown, turning once. Place quesadillas on a baking sheet. Keep warm in
   preheated oven for up to 30 minutes. Repeat with remaining quesadillas. Cut each quesadilla into 3 wedges. Serve with
   salsa, sour cream, and green onion.',
   20, 1, 'Barbecue Quesadillas'),
  (65, 'chicken-pot-pie.jpg',
   '1. Heat oven to 425°F. Make pie crusts as directed on box for Two-Crust Pie using 9-inch glass pie pan. 2. In 2-quart
   saucepan, melt butter over medium heat. Add onion; cook 2 minutes, stirring frequently, until tender. Stir in flour,
   salt and pepper until well blended. Gradually stir in broth and milk, cooking and stirring until bubbly and thickened.
   3. Stir in chicken and mixed vegetables. Remove from heat. Spoon chicken mixture into crust-lined pan. Top with second
   crust; seal edge and flute. Cut slits in several places in top crust. 4. Bake 30 to 40 minutes or until crust is golden
   brown. During last 15 to 20 minutes of baking, cover crust edge with strips of foil to prevent excessive browning. Let
   stand 5 minutes before serving.',
   25, 2, 'Classic Chicken Pot Pie'),
  (40, 'chicken-rice-veg.jpg',
   '1. Arrange chicken in a shallow roasting pan. In a large bowl, combine carrots, sweet potato, onion, celery, 1/4 cup
   of the broth, sage, olive oil, salt, and pepper. Using a slotted spoon, arrange vegetables around chicken in pan. Brush
   chicken with liquid remaining in bowl. Bake in a 375 degree F oven for 35 minutes or until chicken is no longer pink
   (170 degrees F) and vegetables are tender, stirring vegetables twice. Transfer chicken to a serving platter; cover to keep
   warm. Add rice, parsley, and remaining 1/4 cup broth to pan; stir to combine. Return to oven; cook about 5 minutes or until
   rice is heated through. Serve rice mixture with chicken.',
   20, 2, 'Chicken and Roasted Vegetable Rice'),
  (35, 'chili.jpeg',
   '1. Brown ground beef in a skillet together with chopped onions and minced garlic. Drain. 2. Rinse and drain kidney beans.
   In a large pot, combine the meat mixture with the remaining ingredients. Bring to a boil and simmer for 20 minutes.',
   10, 2, 'Classic Chili'),
  (20, 'blt.jpg',
   'Cook bacon until crispy, then drain on paper towels. Toast the 8 slices of bread. Spread 1 tablespoon mayo on each
   slice of toasted bread. (More or less, to taste). Add 1 slice of lettuce to 4 pieces of mayo-spreaded toast. Add 2 slices
   of tomato on top of lettuce. Arrange 3 slices of bacon evenly on top of tomato. (Break bacon slices in half to fit, if
   needed.).Add 1 slice of lettuce on top of bacon. Put the remaining 4 pieces of mayo-spreaded toast on top to finish the sandwiches.',
   10, 1, 'Classic BLTs'),
  (20, 'pizza1.jpg',
   '1. You"ve earned a rest! Follow the directions on the back of your favorite pizza and enjoy your evening!',
   0, 1, 'Frozen Pizza'),
  (20, 'pizza1.jpg',
   '1. You"ve earned a rest! Follow the directions on the back of your favorite pizza and enjoy your evening!',
   0, 2, 'Frozen Pizza'),
  (20, 'hot-dogs.jpg',
   'Cook hot dogs, baked beans, and french fries according to preference. Enjoy an evening where your kids actually eat
   what you cooked them.',
   5, 2, 'Hot Dogs'),
  (20, 'hot-dogs.jpg',
   'Cook hot dogs, baked beans, and french fries according to preference. Enjoy an evening where your kids actually eat
   what you cooked them.',
   5, 1, 'Hot Dogs'),
  (25, 'cheeseburger.jpg',
   '1. Divide ground beef into 1/4 lb sections, and form into patties. Place one slice of cheese on a patty and place another patty
   on top, sealing the edges, to create one half pound patty stuffed with cheese. 2. Salt and pepper to taste and cook according
   personal preferences. 3. Cook french fries according to package directions and personal preferences. 4. Top burgers with sliced
   tomato and lettuce, using preferred condiments.',
   15, 1, 'Stuffed Cheeseburgers'),
  (25, 'cheeseburger.jpg',
   '1. Divide ground beef into 1/4 lb sections, and form into patties. Place one slice of cheese on a patty and place another patty
   on top, sealing the edges, to create one half pound patty stuffed with cheese. 2. Salt and pepper to taste and cook according
   personal preferences. 3. Cook french fries according to package directions and personal preferences. 4. Top burgers with sliced
   tomato and lettuce, using preferred condiments.',
   15, 2, 'Stuffed Cheeseburgers'),
  (15, 'pizza-hut.jpg',
   'Dough: Using a bread machine, add the wet ingredients first, then add the sugar followed by the flour (all purpose is fine).
   Add the salt and the yeast last, but on opposite sides. You don''t want the salt and yeast to touch. Start the dough cycle.
   When it is done kneading, take it out and let it rest for about 10 minutes. Don''t let it rise in the bread machine. Divide dough
   into three balls. In three 9" cake pans, put 3 ounces of oil in each making sure it is spread evenly. Using a rolling pin,
   roll out each dough ball to about a 9" circle. Place in cake pans. Spray the outer edge of dough with cooking spray. Cover
   with a plate. Place in warm area and allow to rise for 1 to 1 1/2 hours. For Each Nine Inch Pizza: Preheat oven to 475 degrees F.
   Spoon 1/3 cup sauce on dough and spread to within 1" of edge. Distribute 1 1/2 ounces of shredded mozzarella cheese on top of
   the sauce. Place toppings of your choice in this order: pepperoni or ham, vegetables, meats (cooked ground sausage or beef),
   top with 3 ounces mozzarella cheese. Cook until cheese is bubbling and outer crust is brown.',
   120, 2, 'Homemade Pizza Hut-style Pizza'),
  (20, 'pizza2.jpg',
   'Combine 2 cups flour, undissolved yeast and salt in a large bowl.  Stir very warm water and olive oil into flour mixture.
   Stir in enough remaining flour to make soft dough.  Knead on lightly floured surface until smooth and elastic, about
   4 to 6 minutes.  Cover; let rest on floured surface 10 minutes.  (If using Pizza Crust Yeast, omit 10 minute rest.)
   Lightly oil 1 (14-inch) or 2 (12-inch) round pizza pan(s).**  Sprinkle with cornmeal.  Shape dough into smooth ball.
   Divide and roll dough to fit desired pan(s).  Top pizza as desired.  For a Thin-Crust Pizza:  Add the desired toppings
   to unrisen dough; OR, for a crispier crust, bake the unrisen dough in a preheated 400°F oven for 10 minutes.  Remove
   from oven and add desired toppings (see suggestions below).  Return pizza to oven to finish baking for another 10 to 20
   minutes, or until done.  If you choose not to partially bake, simply bake the completed pizza at 400°F for 20 to 30 minutes
   or until done.  Baking time depends on size and thickness of crust and selected toppings.',
   25, 1, 'Homemade Pizza'),
  (30, 'pork-tenderloin-sliders.jpg',
   '1. Preheat oven to 400°. Rub pork tenderloins with 1 Tbsp. oil, and sprinkle with salt and pepper. Stir together
   sugar and next 3 ingredients; rub over pork. 2. Cook pork in remaining 2 Tbsp. hot oil in a skillet over medium-high
   heat 5 minutes, browning on all sides. Place tenderloins on a wire rack in a jelly-roll pan. 3. Bake at 400° for 20
   minutes or until a meat thermometer inserted in thickest portion registers 155°. Remove from oven, and let stand 10
   minutes. Slice and serve on slider buns with sauces, or wrap tenderloin whole and refrigerate up to 3 days.',
   25, 1, 'Pork Tenderloin Sliders'),
  (20, 'grilled-fish.jpg',
   'Relish: 1. Bring first 5 ingredients to a boil in a small saucepan over medium-high heat; reduce heat to low, and
   simmer, stirring occasionally, 5 minutes. Add jalapeño, and simmer, stirring occasionally, 5 minutes. Remove from
   heat, and let stand 30 minutes. Stir in lime juice. 2. Stir together strawberries and next 4 ingredients in a medium
   bowl. Add vinegar mixture, and stir to coat. Serve immediately, or refrigerate in an airtight container up to 2 days.
   Fish: 1. Pat fillets dry with paper towels, and let stand at room temperature 10 minutes. Meanwhile, coat cold cooking
   grate of grill with cooking spray, and preheat grill to 400° (medium high) heat. 2. Brush both sides of fish with oil;
   sprinkle with salt and pepper. Place fish on grate, and grill, covered with grill lid, 4 minutes or until grill marks
   appear and fish no longer sticks to grate. 3. Carefully turn fish over, using a metal spatula, and grill, without
   grill lid, 2 minutes or just until fish separates into moist chunks when gently pressed. Serve with Strawberry-Blueberry Relish.',
   60, 1, 'Grilled Catfish with Fresh Fruit Relish'),
  (30, 'brinner.jpg',
   'It"s breakfast for dinner!!!! Always a crowd-pleaser! Cook bacon according to preferences (stove or oven). Meanwhile
   heat your skillet or griddle, coat lightly with cooking oil, and start flipping those pancakes! In a seperate skillet,
   heat the vegetable oil and add hashbrowns. Salt and pepper to taste. Serve with orange juice and plenty of butter and
   syrup.',
   10, 1, 'Brinner'),
  (30, 'brinner.jpg',
   'It"s breakfast for dinner!!!! Always a crowd-pleaser! Cook bacon according to preferences (stove or oven). Meanwhile
   heat your skillet or griddle, coat lightly with cooking oil, and start flipping those pancakes! In a seperate skillet,
   heat the vegetable oil and add hashbrowns. Salt and pepper to taste. Serve with orange juice and plenty of butter and
   syrup.',
   10, 2, 'Brinner'),
  (20, 'apple-cinnamon-pork-chops.jpg',
   'Generously season the chops with salt and pepper on both sides. Set aside. In a large skillet over medium-high heat,
   melt 2 tablespoons of butter. Immediately add the pork chops and cook until brown, about 3 minutes per side. Transfer
   to a plate and set aside. Let chops rest for 3 minutes. Return the skillet to medium-high heat and melt 1 tablespoon
   of butter. Immediately add the apples and onion and cook, stirring occasionally, until the onion is translucent, about
   5 minutes. Stir in the brown sugar, cinnamon and cayenne. Stir in the apple cider and cream. Add the pork chops, nestling
   them into the liquid, and cook until the internal temperature of the pork reaches between 145 degrees F. (medium rare),
   with a 3-minute rest, and 160 degrees F. (medium), 3 to 4 minutes per side. Serve the chops with the apple mixture spooned on top',
   10, 2, 'Apple Cinnamon Pork Chops'),
  (25, 'chops-and-beans.jpeg',
   'Season pork chops with pepper. Heat oil in a large skillet over medium-high heat. Cook pork chops in hot oil until
   browned, 3 to 5 minutes per side. Pour beans and salsa over pork chops and season with cilantro. Bring to a boil,
   reduce heat to medium-low, cover the skillet, and simmer until pork chops are cooked no longer pink in the center,
   20 to 35 minutes. An instant-read thermometer inserted into the center should read 145 degrees F (63 degrees C).',
   5, 1, 'Pork Chops with Black Beans and Salsa'),
  (25, 'chicken-enchiladas.jpg',
   'Cook chicken and saute onions. In a medium bowl, combine chicken, 1 cup of cheese, chilies, and onion. In bottom of 3 quart
   oblong baking dish, spread 1/2 can of enchilada sauce . Along one side of each tortilla, spread about 1/2 cup chicken
   mixture. Roll up each tortilla, jelly-roll fashion. Place seam-side down in sauce in baking dish.  Pour remaining 1/2 can
   enchilada sauce over enchiladas. Sprinkle with remaining cheese. Cover, bake at 350 degrees for 25 minutes or until hot. top with sour cream.',
   20, 1, 'Easy Chicken Enchiladas'),
  (300, 'beef-stew.jpg',
   'Place flour in a plastic bag. Add meat cubes a few at a time, shaking to coat. In a large saucepan, brown meat, half
   at a time, in hot oil. Drain fat. In the bottom of a 3 1/2 or 4 qt crock pot, layer meat, oinion, potatoes, vegetables.
   Combine vegetable juice, water, soy sauce, marjoram, oregano, bay leaf, and pepper. Pour over meat and vegetables . Cover
   and cook on high for 5 to 6 hours.',
   20, 2, 'Old-Fashioned Beef Stew');

Insert INTO ingredients_list (qty, ingredient_id, recipe_id)
VALUES ('20 oz', 128, 1),
  ('16 oz', 111, 1),
  ('2 chopped', 21, 1),
  ('1/2 cup fresh', 42, 1),
  ('1/3 cup', 114, 1),
  ('3 chopped', 21, 2),
  ('1/2 cup', 146, 2),
  ('3 tbsp', 55, 2),
  ('1/4 tsp', 64, 2),
  ('1/4 tsp', 65, 2),
  ('3/4 tsp', 73, 2),
  ('6 tbsp', 95, 2),
  ('3 cloves', 44, 2),
  ('1 lb', 79, 3),
  ('1 lb', 19, 3),
  ('2 tsp', 50, 3),
  ('6 cups', 148, 3),
  ('to taste', 64, 3),
  ('to taste', 65, 3),
  ('seve with ', 87, 3),
  ('1 1/2 lb cubed', 1, 4),
  ('2 cloves', 44, 4),
  ('2 tbsp', 95, 4),
  ('4 chopped', 21, 4),
  ('14 oz canned', 41, 4),
  ('2 1/4 oz sliced', 146, 4),
  ('1/2 tsp', 149, 4),
  ('1/4 tsp', 65, 4),
  ('2 cups', 150, 4),
  ('1 cup', 151, 4),
  ('1/3 cup fresh', 42, 4),
  ('sliced', 84, 4),
  ('1 chopped', 25, 5),
  ('16 oz', 80, 5),
  ('16 oz', 78, 5),
  ('8 oz', 100, 5),
  ('10 oz', 130, 5),
  ('29 oz', 152, 5),
  ('1 packet', 71, 5),
  ('1 tbsp', 66, 5),
  ('1 tbsp', 63, 5),
  ('24 oz', 1, 5),
  ('chopped fresh', 54, 5),
  ('garnish with ', 177, 5),
  ('garnish with', 119, 5),
  ('serve with', 88, 5),
  ('1 lb', 17, 6),
  ('1/2 tsp', 43, 6),
  ('pinch', 64, 6),
  ('8 oz', 73, 6),
  ('2 cups diced', 21, 6),
  ('6 cloves', 44, 6),
  ('4 tsp',95, 6),
  ('4 tbsp fresh', 42, 6),
  ('garnish with', 114, 6),
  ('2 cups', 92, 7),
  ('1/2 tsp', 153, 7),
  ('pinch', 64, 7),
  ('2 tbsp', 154, 7),
  ('1 cup', 123, 7),
  ('2 quarts', 102, 7),
  ('3 cups cooked', 14, 7),
  ('8 oz', 75, 8),
  ('1 jar', 108, 8),
  ('1 lb', 6, 8),
  ('2 cloves', 44, 8),
  ('1 cup chopped', 32, 8),
  ('1 cup chopped', 25, 8),
  ('1 cup chopped', 37, 8),
  ('1/4 cup', 115, 8),
  ('6 oz', 155, 9),
  ('2 lb roasted', 14, 9),
  ('1 cup', 131, 9),
  ('2 tsp', 44, 9),
  ('1 3/4 cups', 122, 9),
  ('2 tbsp', 156, 9),
  ('3/4 cup', 115, 9),
  ('2 tbsp melted', 154, 9),
  ('garnish with', 47, 9),
  ('4', 85, 10),
  ('1 cup', 118, 10),
  ('4 oz', 81, 10),
  ('2 cups shredded', 1, 10),
  ('1/2 cup', 141, 10),
  ('1/4 cup', 119, 10),
  ('1 box', 125, 11),
  ('1/3 cup', 154, 11),
  ('1/3 cup chopped', 25, 11),
  ('1/3 cup', 92, 11),
  ('1/2 tsp', 64, 11),
  ('1/4 tsp', 65, 11),
  ('1 3/4 cups', 102, 11),
  ('1/2 cup', 123, 11),
  ('2 1/2 cups cooked', 14, 11),
  ('2 cups', 132, 12),
  ('2 lbs', 1, 12),
  ('1 1/2 cups baby', 23, 12),
  ('1 cup sweet', 22, 12),
  ('1 wedged', 25, 12),
  ('1/2 cup sliced', 24, 12),
  ('1/2 cup', 102, 12),
  ('2 tbsp fresh', 51, 12),
  ('3 tbsp', 95, 12),
  ('1 tsp', 64, 12),
  ('1/2 tsp', 65, 12),
  ('17 pz', 158, 12),
  ('3 tbsp fresh', 55, 12),
  ('2 lbs', 2, 13),
  ('1 chopped', 25, 13),
  ('2 cloves', 44, 13),
  ('2 cans', 78, 13),
  ('2 cans', 100, 13),
  ('2 cans', 99, 13),
  ('1 tbsp', 63, 13),
  ('1 tsp', 65, 13),
  ('2 tsp', 42, 13),
  ('1 lb', 5, 14),
  ('2 large', 21, 14),
  ('8 slices', 160, 14),
  ('1 head', 150, 14),
  ('8 tbsp', 140, 14),
  ('2', 138, 15),
  ('2', 138, 16),
  ('1 package', 9, 17),
  ('1 package', 82, 17),
  ('serve with', 135, 17),
  ('1 can', 163, 17),
  ('1 package', 9, 18),
  ('1 package', 82, 18),
  ('serve with', 135, 18),
  ('1 can', 163, 18),
  ('2 lbs', 2, 19),
  ('1 package', 83, 19),
  ('1 package', 164, 19),
  ('1 package', 135, 19),
  ('1 sliced', 21, 19),
  ('1 head', 150, 19),
  ('2 lbs', 2, 20),
  ('1 package', 83, 20),
  ('1 package', 164, 20),
  ('1 package', 135, 20),
  ('1 sliced', 21, 20),
  ('1 head', 150, 20),
  ('1 cup warm', 148, 21),
  ('1/2 cup', 123, 21),
  ('1/2 tsp', 64, 21),
  ('4 cups', 92, 21),
  ('1 tbsp', 93, 21),
  ('1 package', 94, 21),
  ('1 cup', 96, 21),
  ('1 jar', 110, 21),
  ('1 package', 116, 21),
  ('1 package', 165, 21),
  ('1 package', 32, 21),
  ('1 can sliced', 146, 21),
  ('1 sliced', 34, 21),
  ('2 1/2 cups', 92, 22),
  ('1 package rapid Rise', 94, 22),
  ('3/4 tsp', 64, 22),
  ('1 cup warm', 148, 22),
  ('2 tbsp', 95, 22),
  ('1 tbsp', 166, 22),
  ('1 jar', 110, 22),
  ('1 package', 116, 22),
  ('1 package', 165, 22),
  ('1 package', 32, 22),
  ('1 can sliced', 146, 22),
  ('1 sliced', 34, 22),
  ('2', 167, 23),
  ('3 tbsp', 95, 23),
  ('2 tsp', 64, 23),
  ('1 tsp', 65, 23),
  ('1/4 cup', 168, 23),
  ('2 tbsp', 139, 23),
  ('3 tbsp fresh', 47, 23),
  ('2 tbsp fresh', 49, 23),
  ('20 slider-size', 83, 23),
  ('4 (6oz)', 18, 24),
  ('3 tbsp', 95, 24),
  ('3/4 tsp', 64, 24),
  ('1/4 tsp', 65, 24),
  ('1/2 cup', 175, 24),
  ('1/2 cup', 168, 24),
  ('2 tbsp', 171, 24),
  ('2 cups chopped', 169, 24),
  ('1 cup', 170, 24),
  ('1 cup diced', 174, 24),
  ('2 tbsp fresh', 54, 24),
  ('1 package', 5, 25),
  ('1 package', 136, 25),
  ('1 package', 112, 25),
  ('3', 120, 25),
  ('maple', 113, 25),
  ('to taste', 64, 25),
  ('to taste', 64, 25),
  ('3 tbsp', 96, 25),
  ('serve with', 162, 25),
  ('1 package', 5, 26),
  ('1 package', 136, 26),
  ('1 package', 112, 26),
  ('3', 120, 26),
  ('maple', 113, 26),
  ('to taste', 64, 26),
  ('to taste', 64, 26),
  ('3 tbsp', 96, 26),
  ('serve with', 162, 26),
  ('4', 7, 27),
  ('to taste', 64, 27),
  ('to taste', 65, 27),
  ('3 tbsp', 154, 27),
  ('2 peeled, cored', 26, 27),
  ('1 sliced', 25, 27),
  ('2 tbsp', 168, 27),
  ('2 tsp', 56, 27),
  ('pinch', 62, 27),
  ('2/3 cup', 176, 27),
  ('1/3 cup', 122, 27),
  ('4', 7, 28),
  ('to taste', 65, 28),
  ('1 tbsp', 95, 28),
  ('1 can', 80, 28),
  ('1 cup', 177, 28),
  ('1 tbsp fresh', 54, 28),
  ('garnish with', 119, 28),
  ('1 lb', 1, 29),
  ('1 1/2 cups', 118, 29),
  ('4 oz', 81, 29),
  ('1 chopped', 25, 29),
  ('2 cans', 178, 29),
  ('8', 86, 29),
  ('garnish with', 119, 29),
  ('2 tbsp', 92, 30),
  ('2 lb', 10, 30),
  ('2 tbsp', 96, 30),
  ('3 cups', 104, 30),
  ('1 cup', 148, 30),
  ('1 thinly wedged', 25, 30),
  ('1/2 tsp', 52, 30),
  ('1/2 tsp', 43, 30),
  ('1 tsp', 161, 30),
  ('2', 61, 30),
  ('2 1/2 cups cubed', 22, 30),
  ('3 cups', 132, 30),
  ('1 can', 124, 30);