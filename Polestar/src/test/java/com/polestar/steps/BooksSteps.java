package com.polestar.steps;

import org.junit.Assert;

import com.polestar.datatypes.AddBooksRequest;
import com.polestar.datatypes.Book;
import com.polestar.datatypes.ISBN;
import com.polestar.datatypes.RemoveBookRequest;
import com.polestar.datatypes.responses.Books;
import com.polestar.datatypes.responses.IRestResponse;
import com.polestar.datatypes.responses.UserAccount;
import com.polestar.enums.Context;
import com.polestar.setup.TestContext;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class BooksSteps extends BaseStep {

	private final String USER_ID = "9b5f49ab-eea9-45f4-9d66-bcf56a531b85";
	private Response response;
	private IRestResponse<UserAccount> userAccountResponse;
	private Book book;

	public BooksSteps(TestContext testContext) {
		super(testContext);
	}

	@Given("^A list of books are available$")
	public void listOfBooksAreAvailable() {
		IRestResponse<Books> booksResponse = getEndPoints().getBooks();
		Book book = booksResponse.getBody().books.get(0);
		getScenarioContext().setContext(Context.BOOK, book);
	}

	@When("^I add a book to my reading list$")
	public void addBookInList() {
		Book book = (Book) getScenarioContext().getContext(Context.BOOK);
		String userId = (String) getScenarioContext().getContext(Context.USER_ID);

		ISBN isbn = new ISBN(book.isbn);
		AddBooksRequest addBooksRequest = new AddBooksRequest(userId, isbn);

		IRestResponse<UserAccount> userAccountResponse = getEndPoints().addBook(addBooksRequest);
		getScenarioContext().setContext(Context.USER_ACCOUNT_RESPONSE, userAccountResponse);
	}

	@When("^I remove a book from my reading list$")
	public void removeBookFromList() {
		Book book = (Book) getScenarioContext().getContext(Context.BOOK);
		String userId = (String) getScenarioContext().getContext(Context.USER_ID);

		RemoveBookRequest removeBookRequest = new RemoveBookRequest(userId, book.isbn);

		Response response = getEndPoints().removeBook(removeBookRequest);
		getScenarioContext().setContext(Context.BOOK_REMOVE_RESPONSE, response);
	}	
}
