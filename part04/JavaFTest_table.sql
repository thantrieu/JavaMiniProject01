CREATE TABLE Book (
  ID         varchar(255) NOT NULL, 
  DocumentID varchar(255) NOT NULL, 
  Type       varchar(255) NULL);
CREATE TABLE Person (
  ID       varchar(255) NOT NULL, 
  FullName varchar(255) NULL, 
  Address  varchar(255) NULL, 
  Gender   varchar(255) NULL, 
  Dob      date NULL);
CREATE TABLE Employee (
  ID       varchar(255) NOT NULL, 
  Role     varchar(255) NULL, 
  Shift    varchar(255) NULL, 
  PersonID varchar(255) NOT NULL);
CREATE TABLE Bill (
  ID          varchar(255) NOT NULL, 
  StartDate   date NULL, 
  DueDate     date NULL, 
  Deposit     float(10) NULL, 
  BorrowingID varchar(255) NOT NULL);
CREATE TABLE BookState (
  ID          int IDENTITY NOT NULL, 
  BookID      varchar(255) NOT NULL, 
  BorrowingID varchar(255) NOT NULL, 
  Quantity    int NULL, 
  State       varchar(255) NULL);
CREATE TABLE Borrowing (
  ID         varchar(255) NOT NULL, 
  Total      int NULL, 
  ReaderID   varchar(255) NOT NULL, 
  EmployeeID varchar(255) NOT NULL);
CREATE TABLE Document (
  ID            varchar(255) NOT NULL, 
  Title         varchar(255) NULL, 
  PublishedYear int NULL, 
  Quantity      int NULL, 
  Author        varchar(255) NULL);
CREATE TABLE Reader (
  ID           varchar(255) NOT NULL, 
  PersonID     varchar(255) NOT NULL, 
  KindOfReader varchar(255) NULL, 
  Email        varchar(255) NULL, 
  PhoneNumber  varchar(255) NULL);
