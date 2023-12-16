

function submitReview() {
    // Get user input
    var userName = document.getElementById("userName").value;
    var userComment = document.getElementById("userComment").value;

    // Validate input
    if (!userName || !userComment) {
        alert("Please enter both your name and comment.");
        return;
    }

    // Create a new review element
    var reviewElement = document.createElement("div");
    reviewElement.classList.add("review");

    // Construct the review HTML
    var reviewHtml = `
        <div class="user-avatar">
            <img src="images/avatar.png" alt="User Avatar">
        </div>
        <div class="review-text">
            <div class="user-name">${userName}</div>
            <div class="user-comment">${userComment}</div>
        </div>
    `;

    // Set the HTML content of the review element
    reviewElement.innerHTML = reviewHtml;

    // Append the new review to the reviews container
    var reviewsContainer = document.getElementById("reviewsContainer");
    reviewsContainer.appendChild(reviewElement);

    // Clear the form fields
    document.getElementById("userName").value = "";
    document.getElementById("userComment").value = "";
}
