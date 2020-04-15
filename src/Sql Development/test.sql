use school;
select classes.id , classes.name , head.Name from classes 
      inner join head on classes.HeadID = head.ID;