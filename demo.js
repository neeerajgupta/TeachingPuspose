function redirectToPage() {
    var selectedPage = document.getElementById("pageSelector").value;
    if (selectedPage) {
      window.location.href = selectedPage;
    }
  }

